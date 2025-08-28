import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter length");
    int l = sc.nextInt();

    System.out.println("Enter breadth");
    int b = sc.nextInt();

    int area1 = l*b;
    int area2 = area1*100;
    
    System.out.println(area2);
    }
}