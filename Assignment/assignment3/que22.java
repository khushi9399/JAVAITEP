//  WAP to find greater among three number

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st number");
      int num1 = sc.nextInt();
      System.out.println("Enter 2nd number");
      int num2 = sc.nextInt();

      System.out.println("Enter 3rd number");
      int num3 = sc.nextInt();

      if(num1>num2){
          if(num1>num3){
             System.out.println("1st number is greater");
           }
      }
     else if(num2>num3){
           if(num2>num1){
              System.out.println("2nd number is greater");
           }
     }
     else if(num3>num1){
             if(num3>num2){
                System.out.println("3rd number is greater");
             }
     }
     }
    }
  