package section001_classes;

import java.util.Arrays;

/*
        Primitives:
        ----------
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5;
        double f = 6;
        char g = 7;
        boolean h = true;
*/
public class PrimitivesVsObjects {
    public static void main(String[] args) {
        int primitive = 1;
        int[] array1 = {1};
        String[] array2 = {"Hello"};
        StringBuilder object = new StringBuilder();
        function(primitive, array1, array2, object);

        System.out.println(primitive);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(object);
    }

    private static void function(int primitive,
                                 int[] array1,
                                 String[] array2,
                                 StringBuilder object) {
        primitive = 5;
        array1[0] = 5;
        array2[0] = "Bye";
        object.append("test");
    }
}
