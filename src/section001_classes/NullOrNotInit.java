package section001_classes;

public class NullOrNotInit {
    public static void main(String[] args) {
        MyClass o1 = new MyClass();
        MyClass o2;
        MyClass o3 = null;

        o2 = o1;
        o2 = null;
        o2 = o3;
        o2 = new MyClass();
    }
}
