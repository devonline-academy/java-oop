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

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ClassVsObjectV2 {

    int value = 5;

    public static void main(String[] args) {
        ClassVsObjectV2 object1 = new ClassVsObjectV2();
        ClassVsObjectV2 object2 = new ClassVsObjectV2();

        System.out.println(object1.value);
        System.out.println(object2.value);

        object1.value = -5;

        System.out.println(object1.value);
        System.out.println(object2.value);
    }
}
