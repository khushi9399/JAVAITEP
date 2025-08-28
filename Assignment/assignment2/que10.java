import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter area");
    int a = sc.nextInt();

    double area = 0.5*a*a;

    System.out.println(area);
    }
}