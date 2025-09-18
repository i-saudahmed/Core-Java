package lambda_;

//?  lambda expression advanced with return type of vlaues practice demo 2
@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class Demo2 {
    public static void main(String[] args) {
        A obj = (i, j) -> i + j;
        int result = obj.add(2, 5);
        System.out.println(result);

        int i = 0;
        int j = 0;
        int news = 0;

        try {
            news = i / j;
            System.out.println(news);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println(news);
    }
}
