// ****
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number how many star you want to print");
        int num = sc.nextInt();
        int i;

        for(i=1; i<=num; i++){
            System.out.print("*");
        }
    }
}