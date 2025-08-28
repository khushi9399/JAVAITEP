import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("length");
    int l1 = sc.nextInt();

    System.out.println("breadth");
    int b1 = sc.nextInt();


    System.out.println("Enter length");
    int l2 = sc.nextInt();

    System.out.println("Enter breadth");
    int b2 = sc.nextInt();

    int extraPart = l2-b2;
    int usableArea = (l1*b1)-(l1*l2+b1*l2-(extraPart));

    System.out.println(usableArea);
    }
}














