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

public class JavaStackHeap {

    public static void main(String[] args) {
        int primitive = 5;
        {
            int[] array = {1, 2, 3, 4, 5};
            MyClass object = new MyClass();
            function(primitive, array, object);
            System.out.println(array[0]);
        }
        System.out.println(primitive);
    }

    private static void function(int primitive,
                                 int[] array,
                                 MyClass object) {
        array[0] = 45;
        MyClass notAnObject;
        MyClass object2 = object;

        array = new int[2];
        array[0] = 7;
        System.out.println(array[0]);
    }
}
