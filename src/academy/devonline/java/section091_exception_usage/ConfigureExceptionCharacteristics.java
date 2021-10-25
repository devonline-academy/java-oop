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

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ConfigureExceptionCharacteristics {

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public static final class Ex0 extends RuntimeException {

        /**
         * academy.devonline.java.Ex0
         * at academy.devonline.java.Test.method2(Test.java:34)
         * at academy.devonline.java.Test.method1(Test.java:30)
         * at academy.devonline.java.Test.main(Test.java:26)
         */
        public Ex0() {
        }
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public static final class Ex1 extends RuntimeException {

        /**
         * academy.devonline.java.Ex1: Error message
         * at academy.devonline.java.Test.method2(Test.java:34)
         * at academy.devonline.java.Test.method1(Test.java:30)
         * at academy.devonline.java.Test.main(Test.java:26)
         */
        public Ex1(final String message) {
            super(message);
        }
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public static final class Ex2 extends RuntimeException {

        /**
         * academy.devonline.java.Ex2: Error message
         * at academy.devonline.java.Test.method2(Test.java:34)
         * at academy.devonline.java.Test.method1(Test.java:30)
         * at academy.devonline.java.Test.main(Test.java:26)
         * Caused by: java.lang.Exception: cause
         * at academy.devonline.java.Test.createCause(Test.java:49)
         * at academy.devonline.java.Test.main(Test.java:25)
         */
        public Ex2(final String message,
                   final Throwable cause) {
            super(message, cause);
        }

        /**
         * academy.devonline.java.Ex2: java.lang.Exception: cause
         * at academy.devonline.java.Test.method2(Test.java:34)
         * at academy.devonline.java.Test.method1(Test.java:30)
         * at academy.devonline.java.Test.main(Test.java:26)
         * Caused by: java.lang.Exception: cause
         * at academy.devonline.java.Test.createCause(Test.java:49)
         * at academy.devonline.java.Test.main(Test.java:25)
         */
        public Ex2(final Throwable cause) {
            super(cause);
        }
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public static final class Ex3 extends RuntimeException {

        /**
         * academy.devonline.java.Ex3: Error message
         */
        public Ex3(final String message) {
            super(message, null, true, false);
        }
    }
}
