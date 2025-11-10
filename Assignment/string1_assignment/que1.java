// Write a java program to reverse each word of String.
// 	Sample Input: Java Is Plateform Independent
// 	Output: avaJ sI mrofetalP tnednepednI

import java.util.Scanner;
class Test{
    public static String reverseString(String s){
        String newStr = "";
        for(int i = s.length()-1; i>=0; i--){       //this is the loop to reverse the particular string
            newStr += s.charAt(i);
        }
        return newStr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str = sc.nextLine();

        // Method
        String reverse = "";             //reverse is the variable in which we store the result i.e. reverse String
        String word = "";                //word is the variable in which we add reverse character one by one    
        for(int i =0 ;i < str.length(); i++){
            if(str.charAt(i) != ' '){
                word += str.charAt(i);   //untill we get space we add character in word
            }
            else{
                reverse = reverse + reverseString(word) + " ";   //store word variable in reverse
                word = "";                                       //empty the word variable for storing the second word
            }
        }
            // Reverse last word                                 //b'coz after last word there is no space so we have to handle this
             reverse = reverse + reverseString(word);

             System.out.println("Reverse String : "+reverse);

    } 
}