package section001_classes;

import java.util.Arrays;

public class DynaArrayDemonstration {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);
        dynaArray.add(5);

        System.out.println(Arrays.toString(dynaArray.result));
        System.out.println(dynaArray.count);
    }
}
