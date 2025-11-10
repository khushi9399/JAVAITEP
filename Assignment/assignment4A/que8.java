import java.util.Scanner;
class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number:");
      int n = sc.nextInt();
      // int i = 1;
      int a = 1;
      System.out.println(a);
      int b = 2;
      System.out.println(b);
      int i= 2;
      int next = 0;
      
      while(i<n){
        next = a*b;
        a = b;
        b = next;
        i++;
        System.out.println(next);
      }
    }
}