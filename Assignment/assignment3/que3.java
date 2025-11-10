//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.

import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Salary");
      double salary = sc.nextDouble();
      System.out.println("Enter year of Service");
      double year = sc.nextDouble();
      if(year>5){
        double bonus = salary *5/100;
        System.out.println("Bonus is:"+bonus);
      }
     else{
       System.out.println("Year of service is less than 5");
     }
    }
  }