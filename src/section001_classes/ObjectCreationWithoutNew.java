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

import sun.misc.Unsafe;


/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ObjectCreationWithoutNew {

    public static void main(String[] args) throws Exception {
        MyClass object0 = new MyClass();

        MyClass object1 = MyClass.class.newInstance();
        MyClass object2 = (MyClass) MyClass.class.getDeclaredConstructors()[0].newInstance();

        MyClass object3 = (MyClass) Unsafe.getUnsafe().allocateInstance(MyClass.class);

        //...
    }
}
