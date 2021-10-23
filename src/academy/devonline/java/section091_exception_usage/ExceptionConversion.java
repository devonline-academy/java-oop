/*
 * Copyright 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package academy.devonline.java.section091_exception_usage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import static java.sql.DriverManager.getConnection;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ExceptionConversion {

    public static void main(final String[] args) {
        final ConfigProvider[] providers = {
                new FileConfigProvider(),
                new RelationDatabaseConfigProvider()
        };
        int configValue = 24;
        boolean success = false;
        CantReadConfigValueException aggregateException = null;
        for (final ConfigProvider provider : providers) {
            try {
                configValue = provider.getConfigValue();
                success = true;
                break;
            } catch (final CantReadConfigValueException exception) {
                if (aggregateException == null) {
                    aggregateException = new CantReadConfigValueException(
                            "Can't read config value using the following providers: " + Arrays.toString(providers)
                    );
                }
                aggregateException.addSuppressed(exception);
            }
        }
        if (!success) {
            throw aggregateException;
        }
        System.out.println(configValue);
    }

    public interface ConfigProvider {

        int getConfigValue();
    }

    public static final class CantReadConfigValueException extends RuntimeException {

        public CantReadConfigValueException(final String message) {
            super(message);
        }

        public CantReadConfigValueException(final Exception exception) {
            super(exception);
        }
    }

    public static class FileConfigProvider implements ConfigProvider {

        @Override
        public int getConfigValue() {
            try {
                return Integer.parseInt(Files.readString(Paths.get(System.getProperty("user.home") + "/config-file.txt")));
            } catch (final IOException | NumberFormatException exception) {
                throw new CantReadConfigValueException(exception);
            }
        }
    }

    public static class RelationDatabaseConfigProvider implements ConfigProvider {

        @Override
        public int getConfigValue() {
            try (Connection connection = getConnection("jdbc:postgresql://localhost:5432/db", "user", "password")) {
                try (Statement statement = connection.createStatement()) {
                    try (ResultSet resultSet = statement.executeQuery("SELECT config_value FROM config")) {
                        if (resultSet.next()) {
                            return resultSet.getInt("config_value");
                        } else {
                            throw new CantReadConfigValueException("Table 'config' does not contain value for the required 'config_value' column!");
                        }
                    }
                }
            } catch (final SQLException exception) {
                throw new CantReadConfigValueException(exception);
            }
        }
    }
}
