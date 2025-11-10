// 123456
// 54321
// 1234
// 321
// 12
// 1

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        for(int i = 6; i>=1; i--){
            if(i%2 == 0){ // i is even
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
            }
            else{ // i is odd
                for(int j=i; j>=1; j--){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

