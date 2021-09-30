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
public class MethodReferenceExample {

    @FunctionalInterface
    interface Interface1 {

        void method();
    }

    final Interface1 i1 = System.out::println;

    final Interface1 i2 = this::qwerty;

    void qwerty() {
        System.out.println("qwerty");
    }

    public static void main(final String[] args) {
        final MethodReferenceExample o = new MethodReferenceExample();
        o.i2.method();

        final Interface2 i1 = o::test;

        System.out.println(i1.temp("12"));
    }

    @FunctionalInterface
    interface Interface2 {

        int temp(String value);
    }

    final Interface2 i3 = Integer::parseInt;

    int test(String value) {
        return value.charAt(0);
    }
}
