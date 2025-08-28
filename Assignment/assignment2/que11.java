import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base ratio");
    int baseRatio = sc.nextInt();

    System.out.println("Enter base height");
    int baseHeight = sc.nextInt();

    System.out.println("Enter Area");
    int area = sc.nextInt();

    double ratio=Math.sqrt((2*area)/(baseRatio*baseHeight));
    double actualBase=baseRatio*ratio;
    double actualHeight=baseHeight*ratio;
    System.out.println(actualBase);
    System.out.println(actualHeight);

    }
 }





















