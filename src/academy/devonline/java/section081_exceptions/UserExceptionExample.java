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

package academy.devonline.java.section081_exceptions;

/**
 * gui, console
 *
 * @author devonline
 * @link http://devonline.academy/java
 */
public class UserExceptionExample {

    public static void main(final String[] args) {
        if (args.length == 0) {
            throw new MissingRequiredCommandLineArgumentException("Argument 'gui' or 'console' is required!");
        }
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public static final class MissingRequiredCommandLineArgumentException extends RuntimeException {

        public MissingRequiredCommandLineArgumentException(final String message) {
            super(message);
        }
    }
}