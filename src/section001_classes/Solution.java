package section001_classes;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5};

        DynaArray result = getPositiveNumbers(array);

        for (int i = 0; i < result.count; i++) {
            System.out.print(result.result[i] + " ");
        }
        System.out.println();
    }

    private static DynaArray getPositiveNumbers(int[] array) {
        int[] result = new int[array.length];
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                result[count++] = value;
            }
        }
        DynaArray dynaArray = new DynaArray();
        dynaArray.result = result;
        dynaArray.count = count;
        return dynaArray;
    }
}
