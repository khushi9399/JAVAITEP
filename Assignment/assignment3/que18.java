// WAP to calculate the percentage of students
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      
      System.out.println("Enter the marks of subject1 out of 100");
      int sub1 = sc.nextInt();

      System.out.println("Enter the subject2 out of 100");
      int sub2 = sc.nextInt();

      System.out.println("Enter the subject3 outo 100");
      int sub3 = sc.nextInt();

      int totalMarks = 300;
      int obtainedMarks = sub1+sub2+sub3; 

      float percentage = obtainedMarks/3;
      System.out.println("percentage: " +percentage+ "%");
    }
  }