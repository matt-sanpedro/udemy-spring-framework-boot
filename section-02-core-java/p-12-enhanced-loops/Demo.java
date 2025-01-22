class Student {
    int rollno;
    String name;
    int marks;
}

public class Demo {

    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // // traditional for loop
        // for(int i=0; i<nums.length; i++) {
        //     System.out.println(nums[i]);
        // }

        // enhanced for loop
        for(int n : nums) {
            System.out.println(n);
        }

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
        
        for(Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}