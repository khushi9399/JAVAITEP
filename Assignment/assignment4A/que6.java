import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int tableOfTwo = 0;
    int i=1;
    int table = 2;

  
    while(i<=10){
        tableOfTwo = table * i;
        System.out.println(tableOfTwo);
         i++;
    }
    
   }
}