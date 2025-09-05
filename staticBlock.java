class Mobile {

    String brand;
    int price;
    static String name;

    // ? static block
    static {
        name = "Phone is Apple";
        System.out.println("in static block");
    }

    // constructor
    public Mobile() {
        brand = "";
        price = 2300;
        System.out.println("in constructor...");

    }

    public void Show() {
        System.out.println("Name is " + name + " Brand is " + brand + " Price is " + price);
    }
}

public class staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        // ? load class initially wihtout any issue
        Class.forName("Mobile");
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 999;

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // Mobile.name = "New Tech";

        // obj1.Show();
        // obj2.Show();
    }
}
