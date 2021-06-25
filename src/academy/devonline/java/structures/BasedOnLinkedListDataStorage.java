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
public abstract class BasedOnLinkedListDataStorage extends BaseDataStorage {

    protected Item first;

    protected Item last;

    @Override
    public final void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            addNextItem(item);
        }
        size++;
    }

    protected abstract void addNextItem(Item item);

    @Override
    public final int get() {
        if (size > 0) {
            int result = first.value;
            first = first.next;
            size--;
            if (size == 0) {
                last = null;
            }
            return result;
        } else {
            // TODO throw Exception
            return 0;
        }
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    protected static class Item {

        protected int value;

        protected Item next;

        private Item(int value) {
            this.value = value;
        }
    }
}
