//  Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter 'Y' or 'N' ");
       char answer = sc.next().charAt(0);
        

       if(answer == 'Y'){
         System.out.println("Student will not allowed to sit in exam");
        }else if(answer == 'N'){
         System.out.println("Student will allowed to sit in exam");
       }
    }
  }