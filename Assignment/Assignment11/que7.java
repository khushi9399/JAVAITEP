abstract class Order{
    private int orderId;
    private double amount;

    public Order(int orderId, double amount){
        this.orderId = orderId;
        this.amount = amount;
    }

    abstract void processOrder();
    abstract void cancelOrder();

    public void orderSummary(){
        System.out.println("Order summary of product id "+orderId+" , "+amount);
    }
}

interface DiscountApplicable{
    public void applyDiscount();
}

class OnlineOrder extends Order implements DiscountApplicable{
    public OnlineOrder(int orderId, double amount){
        super(orderId,amount);
    }

    public void processOrder(){
        System.out.println("Order is processing..");
    }

    public void cancelOrder(){
        System.out.println("Order is cancel..");
    }

    public void applyDiscount(){
        System.out.println("Discount is applied ");   
    }
}

class StorePickupOrder extends Order{
    public StorePickupOrder(int orderId, double amount){
        super(orderId,amount);
    }

    public void processOrder(){
        System.out.println("Order is processing..");
    }

    public void cancelOrder(){
        System.out.println("Order is cancel..");
    }
}

class Test{
    public static void main(String args[]){
        OnlineOrder online = new OnlineOrder(11,25000);
        online.orderSummary();
        online.processOrder();
        online.cancelOrder();
        online.applyDiscount();

        System.out.println();

        StorePickupOrder store = new StorePickupOrder(12,50000);
        store.orderSummary();
        store.processOrder();
        store.cancelOrder();
    }
}
