package section001_classes;

public class FunctionOrMethod {

    int value;

    void changeValue() {
        value = 67;
    }

    public static void main(String[] args) {
        FunctionOrMethod object = new FunctionOrMethod();
        System.out.println(object.value);
        object.changeValue();

        System.out.println(object.value);
    }
}
