//. Write a program to print absolute vlaue of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1
//INPUT: -1        OUTPUT: 1

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value ");
      int value = sc.nextInt();
      
      if(value<0){
        value = value*(-1);
      }
     System.out.println("value:"+value);
    }
  }