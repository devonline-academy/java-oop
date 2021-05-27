package structures;

import java.util.Arrays;

public class DynaArray {

    private int[] result = new int[5];

    private int count;

    public void add(int value) {
        if (count == result.length) {
            int[] newArray = new int[result.length * 2];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
        }
        result[count++] = value;
    }

    public void add(int[] array) {
        for (int value : array) {
            add(value);
        }
    }

    public void add(DynaArray dynaArray) {
        for (int i = 0; i < dynaArray.count; i++) {
            add(dynaArray.result[i]);
        }
    }

    public int[] toArray() {
        return Arrays.copyOf(result, count);
    }

    public String asString() {
        final StringBuilder stringBuilder = new StringBuilder().append('[');
        for (int i = 0; i < count; i++) {
            stringBuilder.append(result[i]);
            if (i < count - 1) {
                stringBuilder.append(',').append(' ');
            }
        }
        return stringBuilder.append(']').toString();
    }
}
