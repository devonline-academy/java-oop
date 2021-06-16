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

package academy.devonline.java.structures;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public abstract class BasedOnArrayDataStorage implements DataStorage {

    protected int[] array;

    protected int size;

    public BasedOnArrayDataStorage(int size) {
        array = new int[size];
    }

    public BasedOnArrayDataStorage() {
        this(5);
    }

    @Override
    public final void add(int value) {
        if (size == array.length) {
            grow(array.length == 0 ? 5 : array.length * 2);
        }
        array[size++] = value;
    }

    private void grow(int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public final int size() {
        return size;
    }
}
