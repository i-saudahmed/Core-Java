package lambda_;

//? lambda expression demo 1 
@FunctionalInterface
interface A {
    void show(int i);
}

public class Demo {
    public static void main(String[] args) {
        A obj = (int value) -> System.out.println("Hello this is show " + value + " ");

        obj.show(45);
    }
}
