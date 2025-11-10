// A
// AB
// ABC
// ABCD
// ABCDE
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        for(int i=1; i<=5; i++){
             char a = 'A';
            for(int j=1; j<=i; j++){
              System.out.print(a);
              a++;
            }
            System.out.println();
        }
        
    }
}
