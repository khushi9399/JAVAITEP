import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter length");
    int l = sc.nextInt();

    int a1 = l*l;
    int a2 = 800*900;
    int totalTiles = a2/a1;
    
    System.out.println(totalTiles);
    }
}