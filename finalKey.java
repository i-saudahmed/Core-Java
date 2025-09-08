//! final keyword is for -> class , variable, method

//?  final class Calc {
class Calc {

    private String name = "Saud";
    private int model = 12;

    final int num = 4;
    // ? num = 23;

    public final void show() {
        System.out.println("In Calc show");
    }

    @Override
    public String toString() {
        return "Calc [name=" + name + ", model=" + model + "]";
    }

}

class AdvCalc extends Calc {

    // public void show() {
    // System.out.println("In Adv calc show");
    // }
}

public class finalKey {
    public static void main(String[] args) {
        AdvCalc obj1 = new AdvCalc();
        AdvCalc obj2 = new AdvCalc();

        // obj1.show();
        // System.out.println(obj1);
        boolean result = obj1.equals(obj2);
        System.out.println(result);
    }
}
