import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length1");
    double length1 = sc.nextInt();

    System.out.println("Enter breadth1");
    double breadth1 = sc.nextInt();

    System.out.println("Enter Side");
    double side = sc.nextInt();

    double areaShelly=length1*breadth1;
    double areaRachel=side*side;

    double Difference = areaShelly-areaRachel;

    if (areaShelly>areaRachel){
            System.out.println("Shelly's garden is bigger than Rachel's garden");
        }
        else {
            System.out.println("Rachel's garden is bigger than Shelly's garden");
             }

    }
}