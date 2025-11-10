import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int i = 0;
    int table = 7;
    int tableOfSeven;

    while(i<=10){
        tableOfSeven = table*i;
        System.out.println(tableOfSeven);
        i++;
    }
    }
}