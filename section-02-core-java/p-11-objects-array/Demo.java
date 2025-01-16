// instance variable since belong to a class
class Student {
    int rollno;
    String name;
    int marks;
}

public class Demo {
    public static void main(String[] args) {
        // create an object of Student class
        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "John";
        s1.marks = 84;

        Student s2 = new Student();
        s2.rollno = 102;
        s2.name = "Mark";
        s2.marks = 87;

        Student s3 = new Student();
        s3.rollno = 103;
        s3.name = "Matt";
        s3.marks = 96;

        // an array that can hold student objects 
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i=0;i<students.length;i++) {
            System.out.println("Rollno: " + students[i].rollno + "; Name: " + students[i].name + "; Marks: " + students[i].marks);
        }

    }
}