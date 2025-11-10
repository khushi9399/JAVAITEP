// 5. Multiple Catch Blocks

// 👉 Take two integers and perform division. Handle both ArithmeticException and InputMismatchException separately.

import java.util.Scanner;
import java.util.InputMismatchException;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number :");
    int a = sc.nextInt();

    System.out.println("Enter second number :");
    int b = sc.nextInt();
    int result = 0;
    try{
        result = a/b;
        System.out.println("Result is : "+result);
    }

    catch(ArithmeticException e){
        System.out.println(e+ " :You can't divide by zero");
    }

    catch(InputMismatchException e){
        System.out.println(e+ " :Integers are not allowed");
    }
}
}