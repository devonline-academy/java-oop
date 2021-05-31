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

package section001_classes;

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class SetClassFieldValues {

    int primitive;

    int[] array1 = new int[5];

    String[] array2 = {"one", "two", "three", "four", "five"};

    public static void main(String[] args) {
        SetClassFieldValues object = new SetClassFieldValues();

        System.out.println(object.primitive);
        System.out.println(Arrays.toString(object.array1));
        System.out.println(Arrays.toString(object.array2));
    }
}
