import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int even = 0;
    int odd = 0;
    int i=1;
    int sum = 0;
    
    while(i<=num){
         if(i % 2 == 0 ){
            even = even-i;
         }
         else{
            odd = odd-i;
         }
         i++;  
    } 
    sum = (odd - even) *(-1);
    System.out.print(sum); 
   }
}