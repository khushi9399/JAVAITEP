// import java.util.Scanner;
// import java.util.InputMismatchException;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int roll = 0;
//         boolean valid = false;
        
//         System.out.println("Enter your roll number :");
//         while(!valid){
//             try{
//                 roll = sc.nextInt();
//                 valid = true;
//             }
//             catch(InputMismatchException e){
//                 System.out.println("re-enter the roll number :");
                
//                 sc.next();    //for clearing the buffer
//             }
//         }
//         sc.close();
//         System.out.println("Entered roll number is "+roll);
//     }
// }

//or

import java.util.Scanner;
import java.util.*;

class Test{
    public int input(){
    Scanner sc = new Scanner(System.in);
    try{
     System.out.println("Enter your roll number");
      int a = sc.nextInt();
      return a;
    }  
    catch(InputMismatchException e){
        return input();
    }
} 
    public static void main(String args[]){
    Test t = new Test();
    int result = t.input();
    System.out.println("Your roll number is : "+result);
    }
}
