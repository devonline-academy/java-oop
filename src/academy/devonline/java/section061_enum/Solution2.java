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
public class Solution2 {

    public static final class Status {

        public static final Status STARTED = new Status();

        public static final Status IN_PROGRESS = new Status();

        public static final Status COMPLETED = new Status();

        private Status() {
        }
    }

    public static class Task {

        private Status status = Status.STARTED;

        public void setStatus(final Status status) {
            this.status = status;
        }
    }

    public static void main(final String[] args) {
        Task task = new Task();
        //
        task.setStatus(Status.IN_PROGRESS);
        //
        task.setStatus(Status.COMPLETED);

        //task.setStatus(-45);
    }
}
