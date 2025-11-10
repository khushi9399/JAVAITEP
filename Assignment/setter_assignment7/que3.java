class BankAccount{
    private String  accountNumber;
    private String holderName ;
    private int balance;

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;

    }
    public void setHolderName(String holderName){
        this.holderName=holderName;

    }
    public void setBalance(int setBalance){
        this.balance=balance;

    }
    public void display(){
        System.out.println("book accountNumber="+accountNumber);
         System.out.println("book holderName="+holderName);
          System.out.println("book Balance="+balance);
    }
}
class Test{
    public static void main(String args[]){
       BankAccount ba =new BankAccount();
        ba.setAccountNumber("3455342435");
        ba.setHolderName("Ram");
        ba.setBalance(5000);
        ba.display();
    }
}