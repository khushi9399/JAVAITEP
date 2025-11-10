//Write a Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        
        if(a%5==0 && a%11==0){
            System.out.println("number is divisible by 5 and 11");
        }
        else{
            System.out.println("number is not divisible by 5 and 11");
        }
        
    }
}