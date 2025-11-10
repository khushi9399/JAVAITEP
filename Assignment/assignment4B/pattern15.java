// A
// BB
// CCC
// DDDD
// EEEEE
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       char a = 'A';
    //    char ch = 'E';
       for(int i = 1; i <= 5; i++){
         for(int j = 1; j <= i; j++){
             System.out.print(a);     
        }
        a++;
        System.out.println();
       }
    }
}