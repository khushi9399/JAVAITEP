//W.A.P to check the sign of given number. 
import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Sign of a number is negative");
        }else{
            System.out.println("Sign of a number is positive");
        }
    }
}