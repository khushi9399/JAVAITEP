class Product{
    private int productId;
    private String name;
    private int quantity;
    private int price;

    public void setProductId(int product){
        this.productId=productId;

    }
    public void setName(String name){
        this.name=name;

    }
     public void setQuantity(int quantity){
        this.quantity=quantity;

    }
    public void setPrice(int price){
        this.price=price;

    }

    public void display(){
        System.out.println("product Id="+productId);
         System.out.println("Product name="+name);
         System.out.println("quantity="+quantity);
          System.out.println("Product price="+price);
    }
   public void CalculatePrice(){
      double TotalPrice = quantity*price;
      System.out.println("The Total Price of Product is:" +TotalPrice);
   } 
}
class Test{
    public static void main(String args[]){
        Product p=new Product();
        p.setProductId(1);
        p.setName("Pen");
        p.setQuantity(5);
        p.setPrice(25);
        p.display();
        p.CalculatePrice();
    }
}