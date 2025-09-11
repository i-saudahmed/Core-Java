package interfacess.part1;

// ! interface is another name of abstract classes
// interface is for design purpose
interface A {
    // final and static by default - variable
    int number = 34;

    // public abstract by default ; - method
    void show();

    void data();

}

// ? interface does not have memory in heap so how you can have non final
// ? variable where they will be stored so they are static and final , public
// ! implements get only method not variable
class B implements A {
    // if you dont write complete interface method if it will become abstract
    @Override
    public void show() {
        System.out.println("in show interface");
    }

    @Override
    public void data() {
        System.out.println("in data interface");

    }

}

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.data();
        obj.show();
        System.out.println(A.number);

    }
}