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

package academy.devonline.java.section051_static;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class StaticMethodAsCreator {

    public static class MyClass {

        private static final MyClass TEST_OBJECT = new MyClass();

        private MyClass() {
        }

        public static MyClass create() {
            if (System.getenv("DEV_ENV") != null) {
                return TEST_OBJECT;
            } else {
                return new MyClass();
            }
        }

        public void doSomething() {

        }
    }

    public static void main(final String[] args) {
        //MyClass o = new MyClass();
        MyClass o = MyClass.create();
        o.doSomething();

        System.out.println(Integer.valueOf(3));
    }
}
