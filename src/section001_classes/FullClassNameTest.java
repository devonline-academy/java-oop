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

import section001_classes.package2.Class1;
import structures.DynaArray;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class FullClassNameTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();

        //structures.DynaArray dynaArray2 = new structures.DynaArray();

        Class1 class1 = new Class1();
        section001_classes.package1.Class1 class2 = new section001_classes.package1.Class1();

    }
}
