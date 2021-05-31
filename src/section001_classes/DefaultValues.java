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

import structures.DynaArray;

/*
 * boolean aBoolean = false;
 * byte aByte = 0;
 * short aShort = 0;
 * int anInt = 0;
 * long aLong = 0;
 * float aFloat = 0.0;
 * double aDouble = 0.0;
 * char aChar = 0;
 * String string = null;
 * int[] array = null;
 * DynaArray dynaArray = null;
 */

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class DefaultValues {
    boolean aBoolean;
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    char aChar;
    String string;
    int[] array;
    DynaArray dynaArray;

    public static void main(String[] args) {
        DefaultValues defaultValues = new DefaultValues();
        System.out.println(defaultValues.aBoolean);
        System.out.println(defaultValues.anInt);
        System.out.println(defaultValues.array);
        System.out.println(defaultValues.dynaArray);
    }
}
