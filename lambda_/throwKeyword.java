package lambda_;

class SaudException extends Exception {
    public SaudException(String string) {
        super(string);
    }
}

public class throwKeyword {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                // it will directly throw into the catch block
                throw new SaudException("saud customized error");
            }

        } catch (SaudException e) {
            System.out.println("thats saud " + e.getMessage());

        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("thats the default output" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
    }
}
