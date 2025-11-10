// WAP to remove the duplicate letters from given String.
// 	Sample Input: aabbccddd
// 	Output: abcd

import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        String result = "";

        for(int i = 0; i<str.length(); i++){
            char current  = str.charAt(i);   //in current variable we add 1 to 1 characters of given String

            if(result.indexOf(current) == -1)     //we check the characters of current variable from result index if there is already exist in the result then it's index something 0 and greater than 0, but if there is not present then it's index will be -1

             result += current ;    //if current value is already present in result then we didn't add in the result
        }
        System.out.println(result);
    }
}