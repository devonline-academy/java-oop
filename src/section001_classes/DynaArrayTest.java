package section001_classes;

import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        DynaArray dynaArray2 = new DynaArray();

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.toArray()) + " ");
        System.out.println(dynaArray1.count);

        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.toArray()) + " ");
        System.out.println(dynaArray2.count);

        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);

        System.out.println("------------------------------------");

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.toArray()) + " ");
        System.out.println(dynaArray1.count);

        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.toArray()) + " ");
        System.out.println(dynaArray2.count);
    }
}
