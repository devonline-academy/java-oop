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
                add(dynaArray, value);
            }
        }
        return dynaArray;
    }

    private static void add(DynaArray dynaArray, int value) {
        if (dynaArray.count == dynaArray.result.length) {
            int[] newArray = new int[dynaArray.result.length * 2];
            System.arraycopy(dynaArray.result, 0, newArray, 0, dynaArray.result.length);
            dynaArray.result = newArray;
        }
        dynaArray.result[dynaArray.count++] = value;
    }
}
