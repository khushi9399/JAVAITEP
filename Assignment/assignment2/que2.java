import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter area");
    int a = sc.nextInt();
    System.out.println("Enter base");
    int b = sc.nextInt();
    int l = a/b;
    int p = 2*l+b;
    System.out.println(l);
    System.out.println(p);
    }
}