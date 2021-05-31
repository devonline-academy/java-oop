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
// ${modifier} class ${name}
// where ${modifier} is from set: [default/package, public]
public class ClassTemplate {

    // --------- Fields: ---------
    // ${modifier} ${type} ${name};
    // where ${modifier} is from set: [private, default/package, protected, public]
    private int fieldName;

    // ...

    // --------- Constructors: ---------

    // ${modifier} ${simple-class-name} (${param-list}),
    // where param-list item is ${param-type} ${param-name}, separated by comma and
    // ${modifier} is from set: [private, default/package, protected, public]
    public ClassTemplate(int param1Name, boolean param2Name, String param3Name /* ... */) {
        // constructor body
    }

    // ...

    // --------- Init sections: ---------
    {
        // init section body
    }

    // --------- Methods: ---------
    // ${modifier} ${return-type} ${name} (${param-list}),
    // where param-list item is ${param-type} ${param-name}, separated by comma and
    // ${modifier} is from set: [private, default/package, protected, public]
    public void methodName(int param1Name, boolean param2Name, String param3Name /* ... */) {
        // method body
    }

    // ...

    // --------- Entry point: ---------
    public static void main(String[] args) {

    }
}
