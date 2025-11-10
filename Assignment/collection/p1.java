// import java.util.ArrayList;
// import java.util.HashSet;

// class Category{
//     private String categoryName;
//     private ArrayList<Product> plist;
    
//     public Category(){}
//     public Category(String categoryName){
//         this.categoryName = categoryName;
//         this.plist = new ArrayList<Product>(); 
//     }

//     public void addProduct(Product p){
//         plist.add(p);
//     }

// }
// class Product{
//     private String productName;
//     private int productPrice;

//     public Product(String productName, int productPrice);{
//         this.productName = productName;
//         this.productPrice = productPrice;
//     }

//     public void displayProduct(){
//          System.out.println("Product Name :");
//          System.out.println("Product Price :");
//     }
// }
// class Test{
//     public static void main(String args[]){
//        Product p1 = new Product("Table",500);
//        Product p2 = new Product("Chair",350);
//        Product p3 = new Product("Bed",15000);

//        Category c1 = new Category("Furniture");
//        c1.add(p1);
//        c1.add(p2);
//        c1.add(p3);

//        Product p4 = new Product("Vaseline",15);
//        Product p5 = new Product("Lipstick",1000);
//        Product p6 = new Product("Ponds",200);

//        Category c2 = new Category("Cosmetics");
//        c2.add(p4);
//        c2.add(p5);
//        c2.add(p6);

//        Product p7 = new Product("Mobile",12200);
//        Product p8 = new Product("Laptop",30000);
//        Product p9 = new Product("",200);
      
//        Category c3 = new Category("Electronics");
//        c2.add(p7);
//        c2.add(p8);
//        c2.add(p9);

//        HashMap<String, ArrayList<Product>> hm= new HashMap <String, ArrayList<Product>>();
//        hm.put(hm.getName(),hm.getList());
      


//     }
// }

import java.util.*;
class Product{
    private String name;
    public Product(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name;
    }
}

class Category{
    private String name;
    ArrayList<Product> list = new ArrayList<Product>();
    public Category(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void add(Product p){
        list.add(p);
    }

    public ArrayList<Product> getList(){
        return list;
    }

}

class Test{
    public static void main(String args[]){
        Category c1 = new Category("Furniture");
        c1.add(new Product("Door"));
        c1.add(new Product("Window"));
        c1.add(new Product("Bed"));

        HashMap<String, ArrayList<Product>> hp = new HashMap<String, ArrayList<Product>>();
        hp.put(c1.getName(), c1.getList());

        Set<Map.Entry<String, ArrayList<Product>>> set1 = hp.entrySet();

        for(Map.Entry<String, ArrayList<Product>> s : set1){
            System.out.println("Category: "+s.getKey() + " Products: "+ s.getValue());
        }

    }
}