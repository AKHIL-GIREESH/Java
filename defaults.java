import java.util.*;

class Student{
    int rollNo;
    int grade;
    String name;
}

class StudentwithConstructor extends Student{
    StudentwithConstructor(int rollNo,int grade){
        this.rollNo = rollNo;
        this.grade = grade;
        System.out.println(name);
    }
}

public class defaults {
    public static void main(String a[]){
        Student[] s1 = new Student[1];
        System.out.println(Arrays.toString(s1));

        Student s2 = new Student();
        System.out.println("Name "+s2.name);

        Student s3 = new StudentwithConstructor(10,10);
    }
}
