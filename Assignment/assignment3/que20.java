// W.A.P to check whether a charachter is an alphabet or not.
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter alphabet");
      char alpha = sc.next().charAt(0);
      

      if(alpha >= 'A' && alpha <= 'Z' || alpha >= 'a' && alpha <= 'z'){
        System.out.println("It is an Alphabet");
      }
      else{
        System.out.println("It is not an Alphabet");
      }
    }
  }
