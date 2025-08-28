import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    int l = sc.nextInt();

    System.out.println("Enter breadth");
    int b = sc.nextInt();

    int area = l*b;
    System.out.println(area);
    }
}