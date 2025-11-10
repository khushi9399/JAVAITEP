// *
// **
// ***
// ****
// *****
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int i;
        int j;

        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
