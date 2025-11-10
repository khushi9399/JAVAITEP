//     A
//    AB
//   ABC
//  ABCD
// ABCDE

import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int num = sc.nextInt();
    for(int i = 1; i<=num; i++){
        for(int space = 1; space<=num-i; space++){
            System.out.print(" ");
        }
        char a = 'A';
        for(int j = 1; j<=i; j++){
          System.out.print(a);
        a++;
        }
        System.out.println();
    }
    
    }
}