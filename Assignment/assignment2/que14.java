import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter diameter");
    double d = sc.nextInt();

    System.out.println("Enter h1");
    double h1 = sc.nextInt();

    System.out.println("Enter h2");
    double h2 = sc.nextInt();

    double area = 0.5*d*(h1+h2);

    System.out.println(area);
    }
}