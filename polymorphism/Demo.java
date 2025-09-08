package polymorphism;

//? run time polymorphism example 
//! dynamic method dispatch 

class A {
    public void show() {
        System.out.println("In A Show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C Show");
    }
}

// inheritance is important for like type A and object of B , C .....

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
