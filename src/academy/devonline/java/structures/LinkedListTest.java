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

package academy.devonline.java.structures;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }
        System.out.println(list.asString());

        list.clear();
        System.out.println(list.asString());

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list.asString());
    }
}
