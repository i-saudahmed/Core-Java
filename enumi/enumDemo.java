package enumi;

enum Laptop {

    Macbook(2000), XPS(1200), Surface(1000), Dell(800);

    private int price;

    // ! object create hote hi uski values initialize karwana thats constructor
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class enumDemo {
    public static void main(String[] args) {
        Laptop lap = Laptop.Dell;
        // Status[] ss = Status.values();
        // System.out.println(s);
        // modified for loop or forEach
        // for (Status s : ss) {
        // System.out.println(s + " " + s.ordinal());
        switch (lap) {
            case Macbook:
                System.out.println("Macbook selected");
                break;
            case XPS:
                System.out.println("XPS selected");
                break;
            case Surface:
                System.out.println("Surface selected");
                break;
            case Dell:
                System.out.println("Dell selected");
                break;
        }

    }

}
