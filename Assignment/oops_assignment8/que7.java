// Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

import java.util.ArrayList;
class Bank{
    ArrayList<Account> acc = new ArrayList<Account>();

    public void addAccount(Account account){
         acc.add(account);
    }
    public void removeAccount(Account account){
        acc.remove(account);
    }
    public void displayAllAccount(){
        for(Account account:acc){
            account.display();
        }
    }
}
class Account{
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public Account(String accountHolderName,int accountNumber,double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Total balance after deposit: "+this.balance);  
    }
    public void withdraw(double amount){
        this.balance += amount;
        System.out.println("Total balance after withdraw: " +this.balance);
    }
    public void display(){
            System.out.println("Name :"+accountHolderName+ " Account number :"+accountNumber+ " balance :"+balance);
    }
}
class Test{
    public static void main(String args[]){
    Account ac1 = new Account("Kohli", 123456, 4000);
    Account ac2 = new Account("Sheenu", 123456, 9000);
    Account ac3 = new Account("Kamal", 123456, 2000);
    // ac1.display();
    // ac1.deposit(2000);
    Bank b = new Bank();
    b.addAccount(ac1);
    b.addAccount(ac2);
    b.addAccount(ac3);

    b.displayAllAccount();
    b.removeAccount(ac2);
    b.displayAllAccount();
    }
}
