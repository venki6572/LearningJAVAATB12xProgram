package ex_25_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab237_ArrayList_ClassElements {

    public static void main(String[] args){

        Student s1 = new Student("Amit","1");
        Student s2 = new Student("Rohit","2");
        Student s3 = new Student("ABIJIT","3");

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);
        s1.printdetails();
        s2.printdetails();
        s3.printdetails();
    }
}
