// area of rectangle
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length");
      float length = sc.nextFloat();

      System.out.println("Enter the breadth");
      float breadth = sc.nextFloat();

      float area = length*breadth;
      System.out.println(area);
    }
  }