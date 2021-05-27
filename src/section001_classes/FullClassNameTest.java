package section001_classes;

import section001_classes.package2.Class1;
import structures.DynaArray;

public class FullClassNameTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();

        //structures.DynaArray dynaArray2 = new structures.DynaArray();

        Class1 class1 = new Class1();
        section001_classes.package1.Class1 class2 = new section001_classes.package1.Class1();

    }
}
