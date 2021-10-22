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

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Test cases:
 * 1) success
 * <p>
 * try: before doSomething()
 * doSomething() method
 * try: after doSomething()
 * After try-catch
 * <p>
 * 2) InputMismatchException
 * <p>
 * try: before doSomething()
 * catch: InputMismatchException
 * After try-catch
 * <p>
 * 3) IllegalArgumentException
 * <p>
 * try: before doSomething()
 *
 * @author devonline
 * @link http://devonline.academy/java
 */
public class FinallyIntroduction {

    public static void main(final String[] args) {
        try {
            System.out.println("try: before doSomething()");
            doSomething();
            System.out.println("try: after doSomething()");
        } catch (final InputMismatchException exception) {
            System.out.println("catch: InputMismatchException");
        } finally {
            System.out.println("After try-catch");
        }
    }

    /**
     * @throws InputMismatchException
     * @throws IllegalArgumentException
     */
    private static void doSomething() {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0) {
            throw new IllegalArgumentException("value < 0");
        }
        System.out.println("doSomething() method");
    }
}
