//Arithmetic Exception Example
import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first value :");
    int a = sc.nextInt();

    System.out.println("Enter second value :");
    int b = sc.nextInt();
    int c = 0;
     try{
        c = a/b; 
        System.out.println("Result : " +c);
        // System.out.println(c);
    }
     catch(ArithmeticException e){
        // System.out.println(printStackTrace());
        // System.out.println("You can't divide by zero");    //ArithmeticException 
      e.printStackTrace();
    }
   }
}


