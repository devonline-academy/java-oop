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

package academy.devonline.java.section021_inheritance_and_polymorphism;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class InvocationWithoutLocalVar {

    int field;

    void doSomething() {
        System.out.println("doSomething");
    }

    public static void main(String[] args) {
        // 1)
        InvocationWithoutLocalVar object = new InvocationWithoutLocalVar();
        System.out.println(object.field);
        object.doSomething();

        // 2)
        System.out.println(new InvocationWithoutLocalVar().field);
        new InvocationWithoutLocalVar().doSomething();
    }
}
