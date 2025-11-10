// WAP to find word of maximum length in given String.
// 	Sample Input: Dear Student ,You have need to work hard
// `	Output: Student

import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String str = sc.nextLine();
    // int len = str.length();

    int maxLength = -1;
    int maxWord = null;

    String word = "";
    for(int i = 0; i<str.length(); i++){
        if(str.charAt(i) != ' '){
            word += str.charAt(i);
        }else{
         if(word.length() > maxLength){
          maxWord = word;
          maxLength = word.length();
  }
    word = "";
        }
    }
     if(word.length() > maxLength){
          maxWord = word;
          maxLength = word.length();
  }

  System.out.println("Maxword : "+maxWord, "Maxlength : "+maxLength);
}
}

  
