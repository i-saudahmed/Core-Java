class A {
    int age;

    public void show() {
        System.out.println("in show A");
    }

}

public class anonymousClass {
    public static void main(String[] args) {
        // ? anonymous inner class
        A obj = new A() {
            public void show() {
                System.out.println("in anonymous inner class");
            }
        };
        obj.show();
    }
}