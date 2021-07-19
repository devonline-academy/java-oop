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

import java.io.File;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Program {
    public static void main(String[] args) {
        // Home directory: `$HOME` or `%HOMEPATH%`
        System.out.println(System.getProperty("user.home"));
        // New line separator: `\n` or `\r\n`
        System.out.println(System.lineSeparator());
        // Path element separator: `/` or `\`
        System.out.println(File.pathSeparator);
        // Absolute or relative paths separator: `:` or `;`
        System.out.println(File.separator);
        // Read environment variable with name `USERNAME`
        System.out.println(System.getenv("USERNAME"));
    }
}
