// WAP to check wheater number is positive or negative
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number");
      int num = sc.nextInt();

      if(num>=0){
        System.out.println("Given number is positive");
      }
     else{
       System.out.println("Given number is negative");
     }
    }
  }