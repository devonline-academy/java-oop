package section001_classes;

import structures.DynaArray;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, 8, 9, 5, 6, 34};

        DynaArray result = getPositiveNumbers(array);

        System.out.println(result.asString());
    }

    private static DynaArray getPositiveNumbers(int[] array) {
        DynaArray dynaArray = new DynaArray();
        for (int value : array) {
            if (value > 0) {
                //DynaArray.add(dynaArray, value);
                dynaArray.add(value);
            }
        }
        return dynaArray;
    }
}
