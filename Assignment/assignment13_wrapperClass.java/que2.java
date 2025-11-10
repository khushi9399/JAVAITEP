// "1,2,3,4,5,6,7,8,9,10"

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String of numbers :");
        String s = sc.nextLine();
        
        String[] wordArray = s.split(",");

        int sum = 0;
        for(String str : wordArray){           //for-each loop
            try{
             sum += Integer.parseInt(str);
            }
            catch(NumberFormatException e){
                System.out.println("Don't allowed characters");
                return;
            }
        }
        System.out.println("Sum :" +sum);
    }
}


// using for-loop
// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String of numbers :");
//         String s = sc.nextLine();
        
//         String[] wordArray = s.split(",");

//         int sum = 0;
//         for(int i = 0; i<wordArray.length; i++){
//           sum += Integer.parseInt(wordArray[i]);
//         }
//         System.out.println("Sum :"+sum);
//     }
// }