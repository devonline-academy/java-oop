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
public class ExceptionCharacteristics {
    public static void main(final String[] args) {
        try {
            method1();
        } catch (final RuntimeException exception) {
            exception.printStackTrace();

            System.err.println(exception.getClass().getName());
            System.err.println(exception.getMessage());

            for (final StackTraceElement stackTraceElement : exception.getStackTrace()) {
                System.err.println(
                        stackTraceElement.getClassName() + "." +
                                stackTraceElement.getMethodName() + "(" +
                                stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")");
            }
        }
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        final int[] array = new int[10];
        System.out.println(array[array.length]);
    }
}
