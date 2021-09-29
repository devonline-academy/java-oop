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

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class EnumIsExtendable {

    public enum Status {

        STARTED(1),

        COMPLETED(2),

        IN_PROGRESS(3);

        private final int value;

        Status(final int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public boolean isCompleted() {
            return this == COMPLETED;
        }

        @Override
        public String toString() {
            return String.valueOf(ordinal());
        }
    }

    public static void main(final String[] args) {
        final Status status = Status.COMPLETED;

        System.out.println(status.isCompleted());
        System.out.println(status.getValue());

        System.out.println(status);
    }
}
