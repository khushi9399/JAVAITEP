// Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.

import java.util.Scanner;


class Student{
    private String name;
    private char grade;
    private ArrayList<String> courses;
    
    public Student(String name, char grade){
         this.name = name;
         this.grade = grade; 
    }
    public void setCourses(ArrayList<String> list){
        for(String course : list){
            course.add(course);
        }
    }
    public Student(){}
    public void display(){
        System.out.println("Name:")
    }
 
    }
}
class Test{
    public static void main(String args[]){
       Student s1 = new Student("Raja", "B", "B.Sc");
       Student s2 = new Student("Ram", "C", "B.Sc");
       Student s3 = new Student("Seeta", "D", "B.Sc");
       ClassOfStudent cs = new ClassOfStudent();
       cs.addStudent(s1);
       cs.addStudent(s2);
       cs.addStudent(s3);
       cs.displayStudentDetail();
       System.out.println(" -- ");
       cs.addCourses(s2);
       cs.removeCourses(s3);
       cs.displayStudentDetail();
    }
}
