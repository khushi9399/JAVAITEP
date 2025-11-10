// Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).

import java.util.Scanner;

class Product{
    private int pid;
    private int price;
    private int quantity;

    public int getPid(){
            return this.pid;
    }
    public int getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public Product(int x,int y, int z){
        this.pid = x;
        this.price = y;
        this.quantity = z;
    }

}

class XYZ{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     Product arr[] = new Product[5];
     
     for(int i = 0; i < 5; i++){
        System.out.println("Enter id :"+" Enter price :" +"Enter qunantity");
        int pid = sc.nextInt();
        int price = sc.nextInt();
        int quantity = sc.nextInt();
     }

     int initial = 0;
     int maxPrice = pro
    }
}