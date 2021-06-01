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

package academy.devonline.java.section011_base_structures;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class StaticArrayExample {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        String[] array2 = new String[20];
        StaticArrayExample[] array3 = new StaticArrayExample[1_000_000];

        array1[9] = 23;
        array2[19] = "Hello";
        array3[999_999] = new StaticArrayExample();
    }
}
