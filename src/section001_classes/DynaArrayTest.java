package section001_classes;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);
        dynaArray.add(5);

        //dynaArray.count = 20;

        System.out.println(dynaArray.asString());
    }
}
