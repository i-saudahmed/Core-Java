//? all you know about inner class in java

class A {
    int age;

    public void show() {
        System.out.println("in show A");
    }

    // static class B {
    class B {
        public void config() {
            System.out.println("in config inner class");
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // A.B obj1 = new A.B(); // if static class
        A.B obj1 = obj.new B();
        obj1.config();
    }
}