
import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter perimeter");
    int p = sc.nextInt();
    System.out.println("Enter length");
    int l = sc.nextInt();
    int b = p/2-l;
    int a = l*b;
    System.out.println(b);
    System.out.println(a);
    }
}