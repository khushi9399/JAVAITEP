import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter altitude");
    int a = sc.nextInt();

    System.out.println("Enter area");
    double area = sc.nextInt();

    double squareCm = area*1000;
    double b = (2*squareCm)/a;
    System.out.println(b);
    }
}