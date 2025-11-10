// Find even odd using switch case
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter any number:  ");
      int num = sc.nextInt();

      switch(num%2){
        case 0: System.out.println("EVEN");break;
        case 1: System.out.println("ODD");break;
         }
     }
  }