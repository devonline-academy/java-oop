package section001_classes;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        DynaArray dynaArray2 = new DynaArray();

        dynaArray1.add(1);
        dynaArray1.add(2);

        dynaArray2.add(34);

        System.out.println(dynaArray1.count);
        System.out.println(dynaArray2.count);
    }
}
