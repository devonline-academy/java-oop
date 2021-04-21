package section001_classes;

import sun.misc.Unsafe;

public class ObjectCreationWithoutNew {

    public static void main(String[] args) throws Exception {
        MyClass object0 = new MyClass();

        MyClass object1 = MyClass.class.newInstance();
        MyClass object2 = (MyClass) MyClass.class.getDeclaredConstructors()[0].newInstance();

        MyClass object3 = (MyClass) Unsafe.getUnsafe().allocateInstance(MyClass.class);

        //...
    }
}
