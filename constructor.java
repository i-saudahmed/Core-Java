class Human {
    private String name;
    int age;

    // ! constructors
    public Human() {
        age = 12;
        name = "Saud";
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(int age) {
        name = "Carry";
        this.age = age;
    }

    // ! getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // ! setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human("Navin", 33);
        Human obj2 = new Human(11);

        System.out.println("Name is " + obj.getName() + " Age is " + obj.getAge());
        System.out.println("Name is " + obj1.getName() + " Age is " + obj1.getAge());
        System.out.println("Name is " + obj2.getName() + " Age is " + obj2.getAge());

    }
}
