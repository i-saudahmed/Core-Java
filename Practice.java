class Student {
    int rollNo;
    String name;
    int marks;
}

public class Practice {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Saud";
        s1.marks = 89;
        s1.rollNo = 2;

        Student s2 = new Student();
        s2.name = "Misah";
        s2.marks = 88;
        s1.rollNo = 3;

        Student s3 = new Student();
        s3.name = "Navin";
        s3.marks = 78;
        s1.rollNo = 4;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + " : " + students[i].marks);
        // }
        // for (Student stud : students) {
        // System.out.println(stud.name + " : " + stud.marks);
        // }

        // ! forEach loop or enhanced for loop in java
        int numbers[] = new int[4];
        numbers[0] = 23;
        numbers[1] = 33;
        numbers[2] = 44;
        numbers[3] = 21;

        for (int num : numbers) {
            System.out.println(num);
        }

    }
}