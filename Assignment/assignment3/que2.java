//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter value of purchased quantity:");
      double quantity = sc.nextDouble();
      if(quantity<0)
         System.out.println("Invalid Input");
         else{
          quantity = quantity*100;
          if(quantity>=1000){
            double discount = quantity*(0.1);
            quantity = quantity-discount;
            System.out.println("Total cost user have to pay is:"+quantity);
          }else
          System.out.println("Total cost user have to pay is:"+quantity);
         }
   
     }
    }
  