import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int i=1;
    int sum = 0;
  
    while(i<=num){
         sum = sum+i;
         i++;
    }
     System.out.println(sum);
   }
}