// Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
// Test Data
// Input number: 3
// Expected Output :
// Wednesday

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number from 1 to 7");
      int number = sc.nextInt();
     
     if(number == 1){
        System.out.println("Monday");
     }else if(number ==2){
        System.out.println("Tuesday");
     }else if(number == 3){
        System.out.println("Wednesday");
     }else if(number == 4){
        System.out.println("Thursday");
     }else if(number == 5){
        System.out.println("Friday");
     }else if(number == 6){
        System.out.println("Saturday");
     }else{
      System.out.println("Sunday");
     }
    }
  }









    