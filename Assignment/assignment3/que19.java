//  WAP to exchange value to two variable with third variable and without third variable

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter value 1");
       int val1 = sc.nextInt();
        
       System.out.println("Enter value 2");
       int val2 = sc.nextInt();

       System.out.println(val1);
       System.out.println(val2);
        
        //using third variable
       int val3 = val1;
       val1 = val2;
       val2 = val3;
       
       System.out.println(val1);
       System.out.println(val2);

       // without third variable
       val1 = val1+val2;
       val2 = val1-val2;
       val1 = val1-val2;
      
      System.out.println(val1);
      System.out.println(val2);
    }
  }