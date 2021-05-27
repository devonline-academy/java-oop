package section001_classes;

import structures.DynaArray;

public class ClassFieldVsLocalVar {
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
        boolean aBoolean = false;
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

        ClassFieldVsLocalVar object = new ClassFieldVsLocalVar();
        System.out.println(object.aBoolean);

        System.out.println(aBoolean);
    }
}
