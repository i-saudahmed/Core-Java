package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// COMPARATOR VS COMAPRABLE  comparator is easy as compare to it 
// here is only comparator
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class Comparatorcc {

    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(23, "Saad"));
        studs.add(new Student(21, "Ali"));
        studs.add(new Student(24, "Singapuri"));

        Collections.sort(studs, com);
        // Collections.sort(studs);

        for (Student student : studs) {
            System.out.println(student);
        }

    }
}
