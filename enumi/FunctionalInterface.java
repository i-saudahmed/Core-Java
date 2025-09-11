package enumi;

@java.lang.FunctionalInterface
interface A {
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Hello this is inner class show");
            }
        };
        obj.show();
    }
}
