package section001_classes;

import java.util.Arrays;

public class SetClassFieldValues {

    int primitive;

    int[] array1 = new int[5];

    String[] array2 = {"one", "two", "three", "four", "five"};

    public static void main(String[] args) {
        SetClassFieldValues object = new SetClassFieldValues();

        System.out.println(object.primitive);
        System.out.println(Arrays.toString(object.array1));
        System.out.println(Arrays.toString(object.array2));
    }
}
