abstract class Payment{
    private int amount;

    abstract void pay();                        //Abstract Method
     
    void paymentDetails(){
        System.out.println("Amount is :" +amount);
    }

    public Payment(int amount){           //Constructor
        this.amount = amount;
    }
}

interface Refundable{                         //Interface
    void processRefund();
}

class CreditCardPayment extends Payment implements Refundable{
    public CreditCardPayment(int amount){
        super(amount);
    }
    public void pay(){
        System.out.println("Pay...");
    }
    public void processRefund(){
        System.out.println("Process Refund ");
    }
}
class DebitCardPayment extends Payment{
    public DebitCardPayment(int amount){
        super(amount);
    }
     public void pay(){
        System.out.println("Pay...");
    }
}
class UpiPayment extends Payment implements Refundable{
    public UpiPayment(int amount){
        super(amount);
    }
     public void pay(){
        System.out.println("Pay...");
    }
    public void processRefund(){
        System.out.println("Process Refund ");
    }
}

class Test{
    public static void main(String args[]){
        // Payment p = new Payment();
        // p.paymentDetails();
        CreditCardPayment cp = new CreditCardPayment(20000);
        cp.pay();
        cp.processRefund();
        cp.paymentDetails();
        DebitCardPayment dp = new DebitCardPayment(10000);
        dp.pay();
        dp.paymentDetails();
        UpiPayment up = new UpiPayment(900);
        up.pay();
        up.processRefund();
        up.paymentDetails();

        System.out.println("---------------");
         Payment pp = new CreditCardPayment(25000);
         Refundable rr = (Refundable) pp;
         pp.pay();
         rr.processRefund();
         pp.paymentDetails();
         

    }
}


