class A {
    public A() {
        System.out.println("Object Created");
    }

    public static void show() {
        System.out.println("In show");
    }
}

// ? Anonymous Object
public class AnonymousObject {
    public static void main(String[] args) {
        new A().show();
        new A().show();
    }
}
