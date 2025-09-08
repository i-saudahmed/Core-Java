abstract class Car {
    // here declared the abstract method
    // next method should have the initialization of method other wise error
    // class needs to be abstract as well
    // abstract class cannot have method
    // so we wil have reference type class abstract but object of child class
    public abstract void drive();

    public void playMusic() {
        System.out.println("Play music");
    }

}

class WagonR extends Car { // simple class matlb concrete class

    public void drive() {
        System.out.println("i m driving");
    }

}

public class abstractClass {

    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
