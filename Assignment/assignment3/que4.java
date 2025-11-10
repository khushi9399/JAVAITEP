//4.A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your marks:");
      double marks = sc.nextDouble();
      
      if(25>marks){
        System.out.println("The grade is F");
      }
      else if(marks>=25 && marks <= 45){
        System.out.println("The grade is E");
      }
      else if(45>marks && marks <=50){
        System.out.println("The grade is D");
     }else if(50>marks && marks <= 60){
        System.out.println("The grade is C");
     }else if(60>marks && marks <=80){
        System.out.println("The grade is B");
     }else if(80>marks){
        System.out.println("The grade is A");
     }
    }
  }