import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter limit");
    int num = sc.nextInt();
    int i=1;
    while((i*i)<=(num*num)){
         System.out.println(i*i);
         i++;
    }
   }
}