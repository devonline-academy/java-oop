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
public class BasicEnumClass {

    public enum Status {

        STARTED,

        COMPLETED,

        IN_PROGRESS
    }

    public static void main(final String[] args) {
        final Status status = Status.COMPLETED;

        System.out.println(status.toString());
        System.out.println(status.name());
        System.out.println(status.ordinal());

        System.out.println(Status.IN_PROGRESS.ordinal());
        System.out.println(Status.COMPLETED.ordinal());

        final Status status2 = Status.valueOf("COMPLETED");

        if (status == status2) {
            System.out.println("true");
        }

        final Status status3 = Enum.valueOf(Status.class, "COMPLETED");

        System.out.println(status2);
        System.out.println(status3);

        for (final Status value : Status.values()) {
            System.out.print(value + ", ");
        }
    }
}
