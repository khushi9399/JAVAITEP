class Mobile{
    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand){
        this.brand=brand;

    }
    public void setModel(String model){
        this.model=model;

    }
    public void setPrice(float price){
        this.price=price;

    }
    public void display(){
        System.out.println("Brand="+brand);
         System.out.println("Model="+model);
          System.out.println("Price="+price);
    }
    public boolean affordable(){
        if(this.price<20000)
           return true;
        else
           return false;
    }
}
class Test{
    public static void main(String args[]){
        Mobile m=new Mobile();
        m.setBrand("Toyota");
        m.setModel("Fortuner");
        m.setPrice(25000);
        m.display();
        boolean affordableOrNot = m.affordable();
        System.out.println(affordableOrNot);
    }
}