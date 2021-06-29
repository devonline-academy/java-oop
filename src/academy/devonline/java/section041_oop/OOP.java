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

package academy.devonline.java.section041_oop;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class OOP {

    public static void main(String[] args) {
        Class1 class1 = new Class1(new Class2(25));
        class1.doSomething1();
    }

    private interface Interface {

        void doSomething2();
    }

    private static class Class1 {

        private Interface object;

        public Class1(Interface object) {
            this.object = object;
        }

        public void doSomething1() {
            object.doSomething2();
        }
    }

    private static class Class2 implements Interface {

        private int value;

        public Class2(int value) {
            this.value = value;
        }

        @Override
        public void doSomething2() {
            System.out.println(value);
        }
    }
}
