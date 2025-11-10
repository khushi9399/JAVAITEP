abstract class BankAccount{
    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber,int balance){          //Contructor
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit();                       //abstract method
    abstract void withdraw();

    public void showBalance(){
        System.out.println("Account number : "+this.accountNumber+ " & Balance is :"+this.balance);
    }

    public int getBalance(){
        return balance;
    }
}

interface LoanEligible{
    void checkLoanEligibility();
}

class SavingsAccount extends BankAccount implements LoanEligible{
    public SavingsAccount(int accountNumber,int balance){
        super(accountNumber,balance);
    }

    public void deposit(){
        System.out.println("Deposit money..");
    }
    public void withdraw(){
        if(getBalance() > 1000){
           System.out.println("You can withdraw your money");
        }
        else{
            System.out.println("You can't wihdraw money");
        }
    }

    public void checkLoanEligibility(){
        System.out.println("Check loan Eligibility..");
    }
}

class CurrentAccount extends BankAccount{
    public CurrentAccount(int accountNumber,int balance){
        super(accountNumber,balance);
    }

    public void deposit(){
        System.out.println("Deposit your money");
    }
    public void withdraw(){
        System.out.println("You withdraw your money");
    }
}

class Test{
    public static void main(String args[]){
        SavingsAccount sa = new SavingsAccount(12345,200);
        sa.deposit();
        sa.withdraw();
        sa.checkLoanEligibility();
        sa.showBalance();
        CurrentAccount ca = new CurrentAccount(12345,34000);
        ca.deposit();
        ca.withdraw();
    }
}