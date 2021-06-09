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

package academy.devonline.java.section021_inheritance;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class SuperConstructor {

    private static class Parent {

        private Parent() {
            System.out.println("Parent.<init>()");
        }

        private Parent(int value) {
            System.out.println("Parent.<init>(int)");
        }

        private Parent(boolean value) {
            System.out.println("Parent.<init>(boolean)");
        }
    }

    private static class Child extends Parent {

        private Child() {
            super(12);
            System.out.println("Child.<init>()");
        }
    }

    public static void main(String[] args) {
        new Child();
    }
}
