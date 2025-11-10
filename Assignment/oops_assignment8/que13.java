// Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.

import java.util.ArrayList;
class Product{
    private String productName;    
    private int productQuantity;

    public Product(String productName, int productQuantity){
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    void display(){
        System.out.println("Product name : "+this.productName);
        System.out.println("Product quantity : "+this.productQuantity);
    }
}

class Inventory{
    ArrayList<Product> al = new ArrayList<Product>();

    void add(Product p){
        al.add(p);
    }

    void remove(Product p){
        al.remove(p);
    }

    void display(){
        for(Product p : al){
            p.display();
        }
    }
}

class Test{
    public static void main(String args[]){
        Product product1 = new Product("car" , 2);
        Product product2 = new Product("Truck" , 5);
        Inventory vehicles = new Inventory();
        vehicles.add(product1);
        vehicles.add(product2);
        // vehicles.display();
        vehicles.remove(product1);
        vehicles.display();               //remaining que for low inventory

    }
}