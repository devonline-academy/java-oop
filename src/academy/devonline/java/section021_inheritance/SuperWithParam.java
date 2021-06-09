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

package academy.devonline.java.section021_inheritance;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class SuperWithParam {

    private static class GrandParent {

        int value;

        public GrandParent(int value) {
            this.value = value;
        }
    }

    private static class Parent extends GrandParent {

        public Parent(int value) {
            super(value);
        }
    }

    private static class Child extends Parent {

        public Child(int value) {
            super(value);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Child(12).value);
    }
}
