package section001_classes;

public class ClassVsObjectV2 {

    int value = 5;

    public static void main(String[] args) {
        ClassVsObjectV2 object1 = new ClassVsObjectV2();
        ClassVsObjectV2 object2 = new ClassVsObjectV2();

        System.out.println(object1.value);
        System.out.println(object2.value);

        object1.value = -5;

        System.out.println(object1.value);
        System.out.println(object2.value);
    }
}
