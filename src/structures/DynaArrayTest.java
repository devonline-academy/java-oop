package structures;

class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);
        dynaArray.add(5);

        dynaArray.add(new int[]{2, 5});

        DynaArray dynaArray2 = new DynaArray();
        dynaArray2.add(new int[]{-6, -7, -8});
        dynaArray.add(dynaArray2);

        //dynaArray.count = 20;

        System.out.println(dynaArray.asString());
    }
}
