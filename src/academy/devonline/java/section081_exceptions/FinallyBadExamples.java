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
 * @author devonline
 * @link http://devonline.academy/java
 */
public class FinallyBadExamples {

    public static void main(final String[] args) {
        // 1)
        // System.out.println(example1());

        // 2)
        // System.out.println(example2());

        // 3)
        // System.out.println(example3());

        // 4)
        // System.out.println(example4());
    }

    private static int example1() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    private static int example2() {
        try {
            return 2 / 0;
        } finally {
            return 2;
        }
    }

    private static int example3() {
        try {
            return 1;
        } finally {
            String s = null;
            s.length();
        }
    }

    private static int example4() {
        try {
            return 2 / 0;
        } finally {
            String s = null;
            s.length();
        }
    }

    private static int validExample() {
        try {
            // any code
            return 1;
        } finally {
            // code without returns and throw exceptions!
        }
    }
}
