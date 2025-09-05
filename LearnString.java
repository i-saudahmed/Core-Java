public class LearnString {
    public static void main(String[] args) {

        // String instructor = new String("Navin Reddy");
        // // ? behind the scenes it do this ,, see down
        // String name = "Saud";

        // System.out.println("hello " + name);
        // System.out.println("Course Instructor is " + instructor);
        // // System.out.println(instructor.hashCode());

        // System.out.println(name.charAt(1));
        // System.out.println(name.concat("brother"));

        StringBuilder s1 = new StringBuilder("Hello");
        s1.append(" Java ");
        System.out.println(s1); // Hello Java Programming
        // s1.setLength(34);
        // s1.ensureCapacity(88);
        System.out.println(s1.capacity()); // still 21 (no resize needed yet)
    }
}
