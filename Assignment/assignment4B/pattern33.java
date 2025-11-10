// ABCDE
// ABCD
// ABC
// AB
// A

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        for(int i = 5; i>=1; i--){
            char a = 'A';
            for(int j = 1; j<=i; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}

