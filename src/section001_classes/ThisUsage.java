package section001_classes;

public class ThisUsage {

    private int[] result;

    private int count;

    public ThisUsage() {
        this(5);
    }

    public ThisUsage(int size) {
        this.result = new int[size];
    }

    public void add(int value) {
        if (this.count == this.result.length) {
            this.grow(this.result.length * 2);
        }
        this.result[this.count++] = value;
    }

    private void grow(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(this.result, 0, newArray, 0, this.result.length);
        this.result = newArray;
    }

    public static void main(String[] args) {
        ThisUsage object = new ThisUsage();
        object.add(23);
    }
}
