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
public class StaticFields {

    private static int value;

    public static void main(final String[] args) {
        StaticFields o1 = new StaticFields();
        StaticFields o2 = new StaticFields();

        o1.value = 5;
        o2.value = 8;

        System.out.println(o1.value);
        System.out.println(o2.value);
    }
}
