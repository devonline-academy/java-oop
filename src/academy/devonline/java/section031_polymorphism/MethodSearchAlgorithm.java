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
public class MethodSearchAlgorithm {
    public static void main(String[] args) {
        GrandParent o = new Child();
        o.doSomething();
        o.doSomething2();
        System.out.println(o.toString());
        System.out.println(o.getClass());
    }

    private static class GrandParent /* extends Object */ {

        void doSomething() {
            System.out.println("GrandParent.doSomething()");
        }

        void doSomething2() {
            System.out.println("GrandParent.doSomething2()");
        }
    }

    private static class Parent extends GrandParent {

        @Override
        void doSomething() {
            System.out.println("Parent.doSomething()");
        }

        @Override
        public String toString() {
            return "Parent.toString()";
        }
    }

    private static class Child extends Parent {

        @Override
        public String toString() {
            return "Child.toString()";
        }
    }
}
