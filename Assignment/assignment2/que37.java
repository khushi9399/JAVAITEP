 import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter area");
    float a = sc.nextFloat();

    System.out.println("Enter height");
    int h = sc.nextInt();
    
    double rad = a/(2*3.14*h);
    double dia = rad*2;
    
    System.out.println(dia);
    }
}