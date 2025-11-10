//  "1 2 3 4 5 6 7 8 9 10"

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String of numbers :");
        String s = sc.nextLine();
        
        String[] wordArray = s.split(" ");

        int sum = 0;
        for(String str : wordArray){
          try{
             sum += Integer.parseInt(str);
          }
          catch(NumberFormatException e){
             System.out.println("Don't allowed character");
             return;
           }
        }
        System.out.println("Sum :" +sum);
    }
}