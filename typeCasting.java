class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }

    public void hide() {
        System.out.println("in B hide");
    }
}

public class typeCasting {
    public static void main(String[] args) {
        // ? parent type reference child object upCasting automatic
        A obj = new B();
        // obj.show1();
        // ? child refrence type and child object with downCasting
        B obj1 = (B) obj;
        obj1.show();
        obj1.show1();
        obj1.hide();
    }
}
