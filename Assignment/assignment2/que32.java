import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter length of garden");
    int l1 = sc.nextInt();

    System.out.println("Enter length of pool");
    int l2 = sc.nextInt();

    int a1 = l1*l1;
    int a2 = l2*l2;
    int area = a1-a2;
    
    System.out.println(area);
    }
}