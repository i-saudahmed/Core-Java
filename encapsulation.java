class Human {
    private String name;
    private int age;
    private int rollNo;

    // encapsulation getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // setter
    public void setAge(int aage) {
        if (age > 0)
            this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Saud Ahmed");

        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}
