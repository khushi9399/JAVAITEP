//WAP to check wheather number is even or odd
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number");
      int num = sc.nextInt();

      if(num%2 == 0){
        System.out.println("Given number is even");
      }
     else{
       System.out.println("Given number is odd");
     }
    }
  }