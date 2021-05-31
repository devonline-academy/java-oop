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
public class ThisUsage {

    private int[] result;

    private int count;

    public ThisUsage() {
        this(5);
    }

    public ThisUsage(int size) {
        this.result = new int[size];
    }

    public void add(int value) {
        if (this.count == this.result.length) {
            this.grow(this.result.length * 2);
        }
        this.result[this.count++] = value;
    }

    private void grow(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(this.result, 0, newArray, 0, this.result.length);
        this.result = newArray;
    }

    public static void main(String[] args) {
        ThisUsage object = new ThisUsage();
        object.add(23);
    }
}
