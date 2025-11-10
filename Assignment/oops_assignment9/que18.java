// Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).

import java.util.Scanner;
import java.util.ArrayList;
class Shop{
       Scanner sc = new Scanner(System.in);
       ArrayList<Product>shop = new ArrayList<Product>();
          for(int i = 1; i <= 5; i++){
            System.out.print("Enter product id : ");
            int id = sc.nextInt();
            System.out.print("Enter product price : ");
            int price = sc.nextInt();
            System.out.print("Enter quantity : ");
            int quantity = sc.nextInt();
        
            Product p = new Product( id, price, quantity);
            shop.add(p);
       
     }
     
}

class Product{
    private int pid;
    private int price;
    private int quantity;

    public Product(int pid, int price, int quantity){
          this.pid = pid;
          this.price = price;
          this.quantity = quantity;
    }


    // public void addProduct(Product p){
    //        p.add(product);
    // }

    public void displayProductDetails(){
        System.out.println("Product id is : "+pid+ " Price : "+price+ " Quantity :"+quantity);
    System.out.println();
    }
}
class Test{
    public static void main(String args[]){
   
     for(Product p : shop){
        p.displayProductDetails();
     }
    }
}