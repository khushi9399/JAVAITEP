/*
1. Banking System – Insufficient Balance

You are building a banking system. A user tries to withdraw more money than available in their account.

Which exception would you throw?

Will you use a checked or unchecked exception? Why?

Write a custom exception InsufficientBalanceException.
*/

import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){                     //Default constructor of InsufficientBalanceException
        super("Insufficient Balance");
    }
}

class BankSystem{
    private double amount;

    public BankSystem(double amount){                //Constructor
        this.amount = amount;
    }

    public void deposit(double amount){
      this.amount += amount;
    }

    public void withdraw(double amount)throws InsufficientBalanceException{
    try{
    if(amount > this.amount){
        throw new InsufficientBalanceException();
    }
    else{
      this.amount -= amount;
    }
      display();
    }
    catch(InsufficientBalanceException e){
        // e.printStackTrace();
        System.out.println("In your account there is not so much money that you want to withdraw");
        System.out.println("Sorry!!");
    }
    }
    public void display(){
        System.out.println("Total amount is: "+this.amount);
    }
}
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    BankSystem b = new BankSystem(2);
    System.out.print("Initially ");
    b.display();

    System.out.println("---------------------------");

    System.out.println("After money deposit--");
    b.deposit(2);
    b.deposit(2);
    b.display();
 
    System.out.println("-----------------------------");

    System.out.println("After Withdraw Money--");
    try{
    b.withdraw(2);
    b.withdraw(900);
    }
    catch(InsufficientBalanceException e){
        System.out.println(e.getMessage());
    }
    b.display();
    
    }
}