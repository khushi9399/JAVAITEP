import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter area");
    double a = sc.nextInt();

    System.out.println("Enter l1");
    double l1 = sc.nextInt();

    double l2 = (2*a)/l1;
    System.out.println(l2);
    }
}