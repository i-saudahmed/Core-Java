import java.util.ArrayList;

// import java.lang.*;

import inheritance.VeryAdvCalc;

public class Demo2 {
    public static void main(String[] args) {

        // ArrayList List = new ArrayList<>();
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(2, 5);
        int r2 = obj.sub(2, 5);
        int r3 = obj.multi(2, 5);
        int r4 = obj.div(20, 5);
        double r5 = obj.power(3, 4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

    }
}
