// 1. Divide by Zero Exception

// 👉 Write a program that takes two numbers from the user and divides them. Handle the case where the second number is zero.

// // Expected
// Enter first number: 10
// Enter second number: 0
// java.lang.ArithmeticException caught: / by zero



//First approach if both number is interger-->


// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter first number :");
//         int a = sc.nextInt();
//         System.out.println("Enter second number :");
//         int b = sc.nextInt();
//         int result = 0;

//         try{
//          result = a/b;
//         }

//         catch(ArithmeticException e){
//               e.printStackTrace();
//         }
//         System.out.println("Result is :"+result);

//     }
// }

//if both number is double then it gives us infinity so that's why we use if block
// in case of double divide by zero is not a exception the ans is infinity


import java.util.Scanner;
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
            throw new ArithmeticException("Second number can't be zero");
         }
         result = a/b;
         System.out.printf("Result = %.2f", result);
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}