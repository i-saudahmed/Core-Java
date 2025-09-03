class Calculator {
    int a = 0;
    int b = 0;

    // ? method overloading same name different parameter or say their work will be
    // ? different its compile time polymorphism
    public int add(int a, int b) {
        // System.out.println("the value printing just console");
        return a + b;
    }

    public int add(int a, int b, int c) {
        // System.out.println("the value printing just console");
        return a + b + c;
    }

    public double add(double a, int b) {
        // System.out.println("the value printing just console");
        return a + b;
    }

}

public class Learn {

    public static void main(String args[]) {
        Calculator calc = new Calculator();
        int result = calc.add(2, 4);
        System.out.println(result);
    }
}
