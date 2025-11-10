// 8. Checked vs Unchecked Exception

// 👉 Write a program with a method that throws IOException (checked) and another that throws ArithmeticException (unchecked). Show the difference in compiler behavior

import java.util.Scanner;
import java.io.IOException;

class Test{                                    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        double a = sc.nextInt();
        System.out.println("Enter second number :");
        double b = sc.nextInt();
        double result = 0.0;

        try{
         if(b == 0.0){
            throw new ArithmeticException("Second number can't be zero");       //Unchecked Exception
         }
         result = a/b;
         System.out.printf("Result = %.2f", result);
         System.out.println();
         throw new IOException();                                   //Checked Exception
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        // catch(IOException e){                    //here if we uncomment this code then IOException Code is handle by us
        //     e.printStackTrace();
        // }
    }
}