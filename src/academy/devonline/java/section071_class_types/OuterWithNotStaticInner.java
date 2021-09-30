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

package academy.devonline.java.section071_class_types;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class OuterWithNotStaticInner {

    private static int value1 = 1;
    private int value2 = 2;

    private static void staticMethod() {
    }

    private void method() {
        Inner o = new Inner();
    }

    class Inner {

        void m() {
            value1 = 7;
            value2 = 5;
            staticMethod();
            method();
        }
    }

    public static void main(final String[] args) {
        OuterWithNotStaticInner outer = new OuterWithNotStaticInner();
        Inner o = outer.new Inner();
        o.m();
    }
}
