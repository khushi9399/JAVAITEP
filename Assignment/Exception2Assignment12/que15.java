/*
5. ATM PIN Validation

If the user enters a wrong PIN 3 times, throw a custom exception AccountLockedException.

Which exception handling mechanism will you use?

Should it be checked (force the programmer to handle) or unchecked?
*/

import java.util.Scanner;

class AccountLockedException extends Exception{ 
    public AccountLockedException(){                                               //Default Construtor
      super("You Entered Wrong PIN 3 times..Your account is now Locked");
    }
}

class ATM{
    private int userPin;
    private int count = 0;
    Scanner sc = new Scanner(System.in);

    public ATM(int userPin){
        this.userPin = userPin;                 //Constructor
    }
    
    public void checkPin()throws AccountLockedException{           //method to check pin
    while(count < 3){                           //b'coz we want user can entered pin 3 times
    System.out.println("Enter your pin : ");
    int enteredPin = sc.nextInt();
       if(enteredPin == userPin ){
          System.out.println("Processing payment...");
          return;                                  //when the user enters the correct PIN it will return where it comes from
        }
        else{
          count++;                                 
          System.out.println("You entered wrong PIN--Plese re-try!!");
        }
    }
    throw new AccountLockedException();        //we put this outside loop b'coz we want throw exception when user enter PIN 3 times
    }
}

class Test{
    public static void main(String args[]){
    ATM a = new ATM(1234);
    
    try{
    a.checkPin();
    }
    catch(AccountLockedException e){
        System.out.println(e.getMessage());
    }
  }
}