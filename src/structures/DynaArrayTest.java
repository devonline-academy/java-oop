package structures;

class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray(0);

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);
        dynaArray.add(5);

        dynaArray.add(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});

        DynaArray dynaArray2 = new DynaArray();
        dynaArray2.add(new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1, 0});
        dynaArray.add(dynaArray2);

        dynaArray.add(99);
        dynaArray.add(98);
        dynaArray.add(97);

        // [0, 1, 2, 3, 4, 5, 9, 8, 7, 6, 5, 4, 3, 2, 1, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 99, 98, 97]
        System.out.println(dynaArray.asString());
    }
}
