// A
// BCD
// EFGHI
// JKLMNOP

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        char a = 'A';
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=2*i-1; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
//  Another way-----
// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//             char a = 'A';
//             int letter = 1;
//         for(int i = 1; i <= 4; i++){
//             for(int j = 1; j<=letter; j++){
//                 System.out.print(a);
//                 a++;
//             }
//             System.out.println();
//             letter = 2+letter;
            
//         }
//     }
// }
