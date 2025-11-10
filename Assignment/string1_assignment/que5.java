// WAP to find out total occurrence of each letter in string.
// 	 Sample Input: aabbccddd
// 	 Output:   a- 2 times
// 			b- 2 times
// 			c- 2 times
// 			d- 3 times

import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str = sc.next();

    boolean traverseString[] = new boolean[str.length()];

    for(int i = 0; i<str.length(); i++){
        if(traverseString[i]) continue;
        int count = 1;                    //count is for count number of occurence of each letter        
        for(int j = i+1; j < str.length(); j++){
            if(str.charAt(i) == str.charAt(j)){
                count++;
                traverseString[j] = true;
            }
        }
        System.out.println(str.charAt(i) +" = "+ count +"times");
    }
    
    }
}