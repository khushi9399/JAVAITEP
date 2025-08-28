import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter cost");
    int c = sc.nextInt();

    System.out.println("Enter length");
    int l = sc.nextInt();

    System.out.println("Enter rate");
    int r= sc.nextInt();

    int totalArea = c/r;
    int b = totalArea/l;
    int p = 2*(l+b);
    System.out.println(b);
    System.out.println(p);
    }
}