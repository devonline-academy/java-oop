package section001_classes;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, 8, 9, 5, 6, 34};

        DynaArray result = getPositiveNumbers(array);

        for (int i = 0; i < result.count; i++) {
            System.out.print(result.result[i] + " ");
        }
        System.out.println();
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
