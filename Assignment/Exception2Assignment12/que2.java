// 2. InputMismatchException

// 👉 Ask the user to enter an integer. If the user enters text instead, catch the exception.

// // Expected
// Enter an integer: abc
// java.util.InputMismatchException caught

import java.util.Scanner;
import java.util.InputMismatchException;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Enter first number :");
        int n = sc.nextInt();
        System.out.println("Your number is : "+n);
        }
        

        catch(InputMismatchException e){
            // System.out.println(e.getMessage());
            // e.printStackTrace();
            System.out.println(e+ " : Only intergers are allowed");
        }
    }
}