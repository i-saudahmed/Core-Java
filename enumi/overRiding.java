package enumi;

class A {
    public void show() {
        System.out.println("Hello Show");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("B show");
    }

}

public class overRiding {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
