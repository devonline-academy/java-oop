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

package academy.devonline.java.section031_polymorphism;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class WhyInstanceOfIsBadPractice {

    public static void main(String[] args) {
        Parent parent = new Child1();
        parent.doSomething();

        /*if (parent instanceof Child1) {
            // parent.getClass == Child1.class
            System.out.println("case 1");
        } else if (parent instanceof Child2) {
            // parent.getClass == Child2.class
            System.out.println("case 2");
        }*/
    }

    private interface Parent {

        void doSomething();
    }

    private static class Child1 implements Parent {

        @Override
        public void doSomething() {
            System.out.println("case 1");
        }
    }

    private static class Child2 implements Parent {

        @Override
        public void doSomething() {
            System.out.println("case 2");
        }
    }
}
