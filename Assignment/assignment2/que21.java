import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    int l1 = sc.nextInt();

    System.out.println("Enter breadth");
    int b1 = sc.nextInt();

    System.out.println("Enter height");
    int h1 = sc.nextInt();

      System.out.println("Enter length");
    int l2 = sc.nextInt();

    System.out.println("Enter breadth");
    int b2 = sc.nextInt();

    System.out.println("Enter height");
    int h2 = sc.nextInt();

    int lenIntoM = l1*100;
    int brIntoM = b1*100;
    int higIntoM = h1*100;
    
    int vol1 = lenIntoM*brIntoM*higIntoM;
    int vol2 = l2*b2*h2;
    int noOfBrick = vol1/vol2;

    System.out.println(noOfBrick);
    }
}