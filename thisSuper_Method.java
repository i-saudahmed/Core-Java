class A extends Object {
    public A() {
        System.out.println("in A ");
    }

    public A(int n) {
        System.out.println("in A  value");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B ");
    }

    public B(int n) {
        this();
        // super(n);
        System.out.println("in B value");

    }
}

public class thisSuper_Method {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
