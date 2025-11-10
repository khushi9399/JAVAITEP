// 1
// 00
// 111
// 0000
// 11111
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int i;
        int j;

        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                if(i % 2 == 1)
                System.out.print("1");
                 else if(i % 2 == 0)
                 System.out.print("0");
            }
                System.out.println();
        }
    }
}
