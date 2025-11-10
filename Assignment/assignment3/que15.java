//  Write a java program to accept the cost price of a bike
//     and display the road tax to be paid according to the 
//     following criteria.
//     Cost Price(In Rs)		Tax
//      > 100000			      15%
//      >50000 and <=100000	 10%
//      <=50000			          5%

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the cost of bike(in Rs)");
      float cost = sc.nextFloat();

      if(cost>100000){
        System.out.println("tax will be 15%");
      }else if(cost>50000 && cost<=100000){
        System.out.println("tax will be 10%");
      }else if(cost<=50000){
        System.out.println("tax will be 5%");
      }
    }
  }
