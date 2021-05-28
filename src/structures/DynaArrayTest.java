package structures;

import java.util.Arrays;

class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);

        int[] array = dynaArray.toArray();

        System.out.println(Arrays.toString(array));
        System.out.println(dynaArray.asString());

        array[0] = -1;

        System.out.println(Arrays.toString(array));
        System.out.println(dynaArray.asString());
    }
}
