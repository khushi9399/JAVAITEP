// WAP to calculate area of circle

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius");
      double radius = sc.nextFloat();

      double area = 3.14*radius*radius;
      System.out.println(area);
    }
  }