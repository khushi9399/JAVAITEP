// WAP to find greater among two number
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st number");
      int num1 = sc.nextInt();
      System.out.println("Enter 2nd number");
      int num2 = sc.nextInt();

      if(num1>num2){
        System.out.println("1st number is greater than 2nd");
      }
     else{
       System.out.println("2nd number is greater");
     }
    }
  }