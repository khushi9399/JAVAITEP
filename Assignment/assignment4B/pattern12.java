// a
// ab
// abc
// abcd
// abcde
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
       for(int i = 1; i <= 5; i++){
        char a = 'a';
        for(int j = 1; j <= i; j++){
             System.out.print(a);
             a++;
        }
        System.out.println();
       }
    }
}