//Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter angle 1 of triangle");
        int a = sc.nextInt();
        System.out.println("enter angle 2 of triangle");
        int b = sc.nextInt();
        System.out.println("enter angle 3 of triangle");
        int c = sc.nextInt();

        if((a+b+c) == 180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("not a Valid Triangle");
        }
    }
}