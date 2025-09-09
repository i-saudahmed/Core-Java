abstract class A {
    public abstract void show();

    public abstract void config();
}

public class abstractAnonymousClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in anonymous inner class");
            }

            @Override
            public void config() {
                System.out.println("in config of anonymous inner class");
            }

        };
        obj.show();
        obj.config();
    }
}