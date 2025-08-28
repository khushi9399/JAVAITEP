import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter height");
    double h = sc.nextInt();

    System.out.println("Enter area");
    double a = sc.nextInt();

    double b = Math.sqrt(h*h-a*a);
    double area = 0.5*a*b;
    System.out.println(b);
    System.out.println(area);
    }
}