package section001_classes;

import structures.DynaArray;

/**
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
