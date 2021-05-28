package section001_classes;

public class UseConstructorOrNot {

    private int[] result;

    private int count;

    public UseConstructorOrNot() {
        if (Runtime.getRuntime().availableProcessors() > 2) {
            result = new int[20];
        } else if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            result = new int[10];
        } else {
            result = new int[5];
        }
    }
}
