//     5
//    44
//   333
//  2222
// 11111
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
            for(int j = 1; j<=i;  j++){
                System.out.print(num-i+1);
            }
           
            System.out.println();
        }
    }
}


// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter number");
//       int num = sc.nextInt();
//         for(int i = num; i>=1; i--){                       //5
//            for(int space = 1; space<=num-1; space++){      //         5
//             System.out.print(" ");                         //         44
//            }                                               //         333
//             for(int j = 0; j<=num-i; j++){                 //         2222
//                 System.out.print(i);                       //         11111
//             }
        
//             System.out.println();
//         }
//     }
// }

