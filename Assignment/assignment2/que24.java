import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double l1 = sc.nextDouble();

       System.out.println("Enter height");
       double h1 = sc.nextDouble();

       System.out.println("Enter thickness");
       double t1 = sc.nextDouble();

       double conLenIntoCm = l1*100;
       double conHeiIntoCm = h1*100;
       double conThickIntoCm = t1*100;
       double wallVol = conLenIntoCm*conHeiIntoCm*conThickIntoCm;

       System.out.println("Enter length");
       double l2 = sc.nextDouble();

        System.out.println("Enter breadth");
        double b2 = sc.nextDouble();

        System.out.println("Enter thickness");
        double t2 = sc.nextDouble();

        double brickVol = l2*b2*t2;
        double noOfBrick = wallVol/brickVol;
        double brickCost = noOfBrick/1000;
        double dollarCost = brickCost*900;
        System.out.println(dollarCost);
    }
}