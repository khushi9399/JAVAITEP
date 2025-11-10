/*
4. E-commerce Discount Calculation

Suppose you are dividing total amount by quantity to get per item price. If quantity = 0, what happens?

Which exception will occur?

How will you ensure the program continues and doesn’t stop execution?
*/


import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Amount :");
        int totalAmount = sc.nextInt();

        System.out.println("Enter Quantity :");
        int quantity = sc.nextInt();

        try{
            int pricePerItem = totalAmount / quantity;
            System.out.println("Price per item is : "+pricePerItem);
        }

        catch(ArithmeticException e){
            // e.printStackTrace();
            System.out.println("Quantity can't be zero...please enter valid quantity");
        }

        System.out.println("Program continues...");
       sc.close();
    }
}

