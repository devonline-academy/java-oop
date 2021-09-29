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

package academy.devonline.java.section061_enum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class EnumAsConfigExample {

    public interface ConfigProvider {

        String getConfigValue();
    }

    public enum ConfigProviderImpl implements ConfigProvider {

        SYSTEM_ENVIRONMENT() {
            @Override
            public String getConfigValue() {
                return System.getenv("CONFIG_PARAM");
            }
        },

        SYSTEM_PROPERTY() {
            @Override
            public String getConfigValue() {
                return System.getProperty("CONFIG_PARAM");
            }
        },

        CONFIG_FILE_AT_HOME_DIRECTORY() {
            @Override
            public String getConfigValue() {
                try {
                    return Files.readString(Paths.get(System.getProperty("user.home") + "/config_params.txt"));
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(final String[] args) {
        final ConfigProvider configProvider = args.length > 0 ?
                ConfigProviderImpl.valueOf(args[0]) :
                ConfigProviderImpl.SYSTEM_ENVIRONMENT;
        System.out.println(configProvider.getConfigValue());
    }
}
