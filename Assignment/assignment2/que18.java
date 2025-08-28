import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    int l = sc.nextInt();

    System.out.println("Enter breadth");
    int b = sc.nextInt();

    int perimeter = 2*(l+b);

    int rounds = 10;
    int totalDistance = perimeter*rounds;
    System.out.println(totalDistance);
    }
}