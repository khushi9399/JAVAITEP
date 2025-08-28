import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter base1");
    int b1 = sc.nextInt();

    System.out.println("enter base2");
    int b2 = sc.nextInt();


    System.out.println("Enter height");
    int h = sc.nextInt();

    System.out.println("Enter walk");
    int w = sc.nextInt();

    int h2 = h+w;
    double area = 0.5*(b1+b2)*h+2;

    System.out.println(area);
    }
}














