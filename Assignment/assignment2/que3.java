import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter l1");
    int l1 = sc.nextInt();
    System.out.println("Enter b1");
    int b1 = sc.nextInt();

    System.out.println("Enter l2");
    int l2 = sc.nextInt();
    System.out.println("Enter b2"); 
    int b2 = sc.nextInt();

    int a1 = l1*b1;
    int a2 = l2*b2;
    int total = a2/a1;
    System.out.println(total);
    }
}