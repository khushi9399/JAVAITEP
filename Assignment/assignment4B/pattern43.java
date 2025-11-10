//     1
//    12
//   123
//  1234
// 12345

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
          for(int i = 1; i<=num; i++){
            for(int space = 1; space <= num-i; space++){
                System.out.print(" ");
            }
          
               for(int j = 1; j<=i; j++){
                System.out.print(j);
               }
                 System.out.println();
            }
        }
    }




