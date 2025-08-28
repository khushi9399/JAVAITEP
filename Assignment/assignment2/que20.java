import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    int l = sc.nextInt();

    System.out.println("Enter breadth");
    int b = sc.nextInt();

    System.out.println("Enter height");
    int h = sc.nextInt();
    
    int vol = l*b*h;

    System.out.println(vol);
    }
}