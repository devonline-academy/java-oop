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
class DataStorageTest {

    public static void main(String[] args) {
        DataStorage dataStorage = new StackBasedOnArray(); // new Stack() or new Queue();

        for (int i = 0; i < 5; i++) {
            dataStorage.add(i);
        }

        // 4 3 2 1 0 - for Stack
        // 0 1 2 3 4 - for Queue
        while (dataStorage.size() > 0) {
            System.out.print(dataStorage.get() + " ");
        }
        System.out.println();
    }
}
