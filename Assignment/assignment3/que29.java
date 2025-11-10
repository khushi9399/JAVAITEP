// WAP to find lowest number among four different number
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

      System.out.println("Enter 4th number");
      int num4 = sc.nextInt();

      if(num1<num2 && num1<num3 && num1<num4){
         System.out.println("num1 is lowest");
      }else if(num2<num1 && num2<num3 && num2<num4){
         System.out.println("num2 is lowest");
      }else if(num3<num1 && num3<num2 && num3<num4){
         System.out.println("num3 is lowest");
      }else if(num4<num1 && num4<num2 && num4<num3){
         System.out.println("num4 is lowest");
      }
    }
  }
  