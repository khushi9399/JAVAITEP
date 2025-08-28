import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    float l1 = sc.nextFloat();

    System.out.println("Enter breadth");
    float b1 = sc.nextFloat();

    float l2 = 24f/100;
    float b2 = 15f/100;

    float a1 = l1*b1;
    float a2 = l2*b2;
    float numBrick = a1/a2;
    System.out.println(numBrick);
    }
}