package section001_classes;

public class DefaultConstructor {

    private int value;

    /*public DefaultConstructor(int value) {
        this.value = value;
    }

    public DefaultConstructor() {

    }*/

    public static void main(String[] args) {
        DefaultConstructor object = new DefaultConstructor();
        System.out.println(object.value);
    }
}
