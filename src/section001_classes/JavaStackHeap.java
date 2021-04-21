package section001_classes;

public class JavaStackHeap {

    public static void main(String[] args) {
        int primitive = 5;
        {
            int[] array = {1, 2, 3, 4, 5};
            MyClass object = new MyClass();
            function(primitive, array, object);
            System.out.println(array[0]);
        }
        System.out.println(primitive);
    }

    private static void function(int primitive,
                                 int[] array,
                                 MyClass object) {
        array[0] = 45;
        MyClass notAnObject;
        MyClass object2 = object;

        array = new int[2];
        array[0] = 7;
        System.out.println(array[0]);
    }
}
