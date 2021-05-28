package section001_classes;

// ${modifier} class ${name}
// where ${modifier} is from set: [default/package, public]
public class ClassTemplate {

    // --------- Fields: ---------
    // ${modifier} ${type} ${name};
    // where ${modifier} is from set: [private, default/package, protected, public]
    private int fieldName;

    // ...

    // --------- Constructors: ---------

    // ${modifier} ${simple-class-name} (${param-list}),
    // where param-list item is ${param-type} ${param-name}, separated by comma and
    // ${modifier} is from set: [private, default/package, protected, public]
    public ClassTemplate(int param1Name, boolean param2Name, String param3Name /* ... */) {
        // constructor body
    }

    // ...

    // --------- Init sections: ---------
    {
        // init section body
    }

    // --------- Methods: ---------
    // ${modifier} ${return-type} ${name} (${param-list}),
    // where param-list item is ${param-type} ${param-name}, separated by comma and
    // ${modifier} is from set: [private, default/package, protected, public]
    public void methodName(int param1Name, boolean param2Name, String param3Name /* ... */) {
        // method body
    }

    // ...

    // --------- Entry point: ---------
    public static void main(String[] args) {

    }
}
