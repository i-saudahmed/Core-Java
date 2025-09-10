package interfacess;

interface A {
    void data();
}

interface X {
    void run();
}

interface Y extends X {
}

class B implements A, Y {

    @Override
    public void data() {
        System.out.println("in data");
    }

    @Override
    public void run() {
        System.out.println("in run");
    }

}

public class Demo2_Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.data();

        X obj1 = new B();
        obj1.run();
    }
}