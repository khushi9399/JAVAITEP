import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    int l = sc.nextInt();
    System.out.println("Enter breadth");
    int b = sc.nextInt();
    int a = l*b;
    int sqMeter = a/100;
    int total = sqMeter*6;
    System.out.println(total);
    }
}