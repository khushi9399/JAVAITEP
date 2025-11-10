//  Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter a character");
       char answer = sc.next().charAt(0);
        System.out.println(answer);

       if(answer >= 'A' && answer <= 'Z'){
         System.out.println("Given character is Uppercase");
        }else if(answer >= 'a' && answer <= 'z'){
         System.out.println("Given character is Lowercase");
       }
    }
  }