import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter of side of cube");
    int s = sc.nextInt();

    System.out.println("Enter length");
    int l = sc.nextInt();

    System.out.println("Enter breadth");
    int b = sc.nextInt();

    System.out.println("Enter height");
    int h = sc.nextInt();

    int vol1 = s*s*s;
    int vol2 = l*b*h;
    int noOfBoxes = vol2/vol1;
    
    System.out.println(noOfBoxes);
    }
}