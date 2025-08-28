import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter edge of cube");
    int cubeEdge = sc.nextInt();

    System.out.println("Enter value of a");
    int a = sc.nextInt();
    System.out.println("Enter value of b");
    int b = sc.nextInt();
    System.out.println("Enter value of c");
    int c = sc.nextInt();

    int cubeVol = cubeEdge*cubeEdge;
    int cuboidVol = a*b*c;

    if (cubeVol>cuboidVol){
        System.out.println("cube vol is greater than cuboid vol");
    }else{
        System.out.println("cuboid vol is greater than cube vol");
    }
    }
    }
