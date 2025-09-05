class Mobile {
    static String name;
    String brand;
    int price;

    public void Show() {
        System.out.println("Name is " + name + " Brand is " + brand + " Price is " + price);
    }
}

public class LearnStatic {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        // obj1.name = "SmartPhone";
        obj1.price = 999;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        // obj2.name = "SmartPhone";
        obj2.price = 339;

        // ! for static variable
        Mobile.name = "New Tech";

        obj1.Show();
        obj2.Show();
    }
}
