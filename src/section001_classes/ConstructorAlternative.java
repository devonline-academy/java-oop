package section001_classes;

public class ConstructorAlternative {

    private int value;

    public ConstructorAlternative() {
        //value = 23;
    }

    {
        value = 78;
    }

    public static void main(String[] args) {
        ConstructorAlternative object = new ConstructorAlternative();
        System.out.println(object.value);
    }
}
