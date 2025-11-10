// Check given character is vowel or not using switch case
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter any alphabet:  ");
     char alpha = sc.next().charAt(0);

      switch(alpha){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': System.out.println("It is vowel");break;
        default: System.out.println("Not a vowel");break; 
         }
     }
  }