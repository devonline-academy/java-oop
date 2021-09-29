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

package academy.devonline.java.section061_enum;

import java.io.Serializable;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class EnumCanImplementInterface {

    public interface MyInterface {

        int getValue();
    }

    public enum Status implements MyInterface, Serializable, Cloneable, AutoCloseable {

        STARTED,

        COMPLETED,

        IN_PROGRESS;

        @Override
        public int getValue() {
            return ordinal();
        }

        @Override
        public void close() {

        }
    }

    public static void main(final String[] args) {
        final MyInterface myInterface = Status.COMPLETED;

        System.out.println(myInterface.getValue());
    }
}
