import java.util.ArrayList;

class Student {
    String name;
    int rollno;
    double marks;
} 
public class st {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.name= "Harshita";
        s1.rollno = 101;
        s1.marks = 85;

        s2.name="A";
        s2.rollno = 102;
        s2.marks = 72;

        s3.name = "B";
        s3.rollno = 103;
        s3.marks = 91;
        System.out.println("Name: " + s1.name + ",\t Roll No: " + s1.rollno + ",\t Marks: " + s1.marks);
        System.out.println("Name: " + s2.name + ",\t Roll No: " + s2.rollno + ",\t Marks: " + s2.marks);
        System.out.println("Name: " + s3.name + ", \t Roll No: " + s3.rollno + ",\t Marks: " + s3.marks);
       
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("\nUsing ArrayList:");
        
        // for (Student student : students) {
        //     System.out.println("Name: " + student.name + ",\t Roll No: " + student.rollno + ",\t Marks: " + student.marks);
        // }
    }
}
