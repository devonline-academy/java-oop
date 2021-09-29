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
public class StaticIsGlobalNotStaticIsLocal {
    private static int staticField;
    private int field;

    static {
        staticField = 67;
        staticMethod1();
        staticMethod2();
    }

    public StaticIsGlobalNotStaticIsLocal() {
        field = 78;
        staticField = 89;

        method1();
        method2();

        staticMethod1();
        staticMethod2();
    }

    public static void staticMethod1() {
        staticField = 67;
        staticMethod2();
    }

    public static void staticMethod2() {
        staticField = 78;
        staticMethod1();
    }

    public void method1() {
        this.field = 78;
        staticField = 89;

        this.method2();

        staticMethod1();
        staticMethod2();
    }

    public void method2() {

    }

    public static void main(final String[] args) {
        StaticIsGlobalNotStaticIsLocal o = new StaticIsGlobalNotStaticIsLocal();

        new StaticIsGlobalNotStaticIsLocal();

        o.method1();
        System.out.println(o.field);
    }
}
