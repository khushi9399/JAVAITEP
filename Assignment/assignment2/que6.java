import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter area");
    int a = sc.nextInt();

    System.out.println("Enter breadth");
    int b = sc.nextInt();

    System.out.println("Enter perimeter");
    int p = sc.nextInt();

    int c = p-a-b;
    double semi_perimeter = (a+b+c)/2;
    double area = Math.sqrt(semi_perimeter*(semi_perimeter-a)*(semi_perimeter-b)*(semi_perimeter-c));
    System.out.println((int)area);
    }
}