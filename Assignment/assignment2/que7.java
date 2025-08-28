import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base");
    int b = sc.nextInt();

    System.out.println("Enter area");
    int a = sc.nextInt();

    int h = (2*a)/b;
    System.out.println(h);
    }
}