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

package academy.devonline.java.section081_exceptions;

import java.util.ServiceLoader;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class ErrorVsException {
    public static void main(final String[] args) {
        final Test test = ServiceLoader.load(Test.class).findFirst().orElseThrow();

        try {
            test.doSomething();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public interface Test {

        void doSomething() throws Exception;
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public static final class TestIml implements Test {

        @Override
        public void doSomething() throws Exception {
            final int[] ints = new int[Integer.MAX_VALUE];
            throw new OutOfMemoryError("");
        }
    }
}
