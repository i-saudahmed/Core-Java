class Laptop {
    int price;
    String name;

    // public boolean equals(Laptop obj2That) {
    // System.out.println(this.name + " :: " + this.price);
    // return this.name.equals(obj2That.name) && this.price == obj2That.price;
    // }

    @Override
    public String toString() {
        return "Laptop [price=" + price + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }

}

public class StringEqualsHashCode {

    public static void main(String[] args) {
        Laptop obj = new Laptop();
        Laptop obj2 = new Laptop();

        obj.name = "Hp emv";
        obj.price = 3400;

        // System.out.println(obj);

        obj2.name = "Hp emv";
        obj2.price = 3400;

        boolean result = obj.equals(obj2);

        // ? by default equals method which check whether the hexa values are same or
        // ? not in this case we have not so false we will create our own equals method

        // ! equals check reference we overRide then it check the value based
        // ! hashcode is the integer hash code which is used for hash list and hash map
        // ! toString gives the class name @ hashInteger value
        // ! our class by default inherit the object class indirectly

        System.err.println(result);
    }
}
