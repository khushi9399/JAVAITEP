// *****
// *****
// *****
// *****
// *****
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int i=5;
        int j=5;

        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                if(i == j){
                System.out.println("*****");
            }  
        }
    }
}
}