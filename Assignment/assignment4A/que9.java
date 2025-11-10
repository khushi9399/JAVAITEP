import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    double sum = 0;
    float i=1;
    while(i<=num){
        sum =  sum +(1/i);
        i++;
    }
    System.out.println("Sum : " +sum);
    }
}