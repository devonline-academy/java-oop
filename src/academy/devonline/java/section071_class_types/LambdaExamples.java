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
public class LambdaExamples {

    @FunctionalInterface
    interface Interface1 {

        void method();
    }

    final Interface1 i1 = new Interface1() {
        @Override
        public void method() {
            System.out.println();
            System.out.println();
        }
    };

    final Interface1 i2 = () -> {
        System.out.println();
        System.out.println();
    };

    final Interface1 i3 = new Interface1() {
        @Override
        public void method() {
            System.out.println();
        }
    };

    final Interface1 i4 = () -> System.out.println();

    // -----------------------------------------------------------------------------------------------------------------

    @FunctionalInterface
    interface Interface2 {

        int qwerty();
    }

    final Interface2 i5 = new Interface2() {
        @Override
        public int qwerty() {
            return 3 * 4 + Runtime.getRuntime().availableProcessors();
        }
    };

    final Interface2 i6 = () -> 3 * 4 + Runtime.getRuntime().availableProcessors();

    final Interface2 i7 = new Interface2() {
        @Override
        public int qwerty() {
            int sum = 4 + 5;
            if (sum > 0) {
                return -sum;
            }
            return sum;
        }
    };

    final Interface2 i8 = () -> {
        int sum = 4 + 5;
        if (sum > 0) {
            return -sum;
        }
        return sum;
    };

    // -----------------------------------------------------------------------------------------------------------------

    @FunctionalInterface
    interface Interface3 {

        int temp(int a);
    }

    final Interface3 i9 = new Interface3() {
        @Override
        public int temp(final int a) {
            return a * a;
        }
    };

    final Interface3 i10 = a -> a * a;

    final Interface3 i11 = new Interface3() {
        @Override
        public int temp(final int var1) {
            if (var1 < 0) {
                return 0;
            } else {
                return var1 * var1;
            }
        }
    };

    final Interface3 i12 = var1 -> {
        if (var1 < 0) {
            return 0;
        } else {
            return var1 * var1;
        }
    };

    // -----------------------------------------------------------------------------------------------------------------

    @FunctionalInterface
    interface Interface4 {

        void anyName(int integer, boolean aBoolean, String myFirstString);
    }

    final Interface4 i13 = new Interface4() {
        @Override
        public void anyName(final int integer, final boolean aBoolean, final String myFirstString) {
            System.out.println(integer);
            System.out.println(aBoolean);
            System.out.println(myFirstString);
        }
    };

    final Interface4 i14 = (integer, aBoolean, myFirstString) -> {
        System.out.println(integer);
        System.out.println(aBoolean);
        System.out.println(myFirstString);
    };

    // -----------------------------------------------------------------------------------------------------------------

    interface Interface5 {

        void anyName();

        void qwerty();
    }

    final Interface5 i15 = new Interface5() {
        @Override
        public void anyName() {

        }

        @Override
        public void qwerty() {

        }
    };

    final AbstractClass a1 = new AbstractClass() {
        @Override
        public void method() {

        }
    };
}
