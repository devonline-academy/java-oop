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
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class MultiCatchExample {

    public static void main(final String[] args) {
        try {
            doSomething();
        } catch (InputMismatchException e) {
            System.err.println("InputMismatchException: " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.err.println("NoSuchElementException: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.err.println("IllegalStateException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        }
        System.out.println("After doSomething()");
    }

    /**
     * @throws InputMismatchException
     * @throws NoSuchElementException
     * @throws IllegalStateException
     * @throws IllegalArgumentException
     * @throws ArithmeticException
     * @throws ClassNotFoundException
     */
    private static void doSomething() throws ClassNotFoundException {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0) {
            throw new IllegalArgumentException("value < 0");
        }
        if (value == 0) {
            throw new ArithmeticException("value = 0!");
        }
        if (value == 5) {
            throw new ClassNotFoundException("value = 5");
        }
        System.out.println("OK");
    }
}
