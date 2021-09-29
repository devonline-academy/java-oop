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
public class StaticVsNotStatic {
    private static class Static {
        private static int value = 56; //1
        private static final int CONST1 = 78; //7
        private static final int CONST2; //8

        static {
            value = 23; //2
            CONST2 = 89; //8
        }

        public static int getValue() { //3
            return value;
        }

        public static void setValue(final int value) { //4
            Static.value = value; //5
        }
    }

    private static class NotStatic {
        private int value = 56; //1
        private final int const1 = 78; //7
        private final int const2; //8

        {
            value = 23; //2
        }

        public NotStatic() {
            this.value = 23; //2
            this.const2 = 89; //8
        }

        public int getValue() { //3
            return value;
        }

        public void setValue(final int value) {//4
            this.value = value; //5
        }
    }

    public static void main(final String[] args) {
        // 6
        System.out.println(Static.getValue());
        Static.setValue(45);
        System.out.println(Static.getValue());

        // 6
        NotStatic o = new NotStatic();
        System.out.println(o.getValue());
        o.setValue(45);
        System.out.println(o.getValue());
    }
}
