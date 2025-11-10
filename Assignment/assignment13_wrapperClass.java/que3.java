// "Hello 1 world 2 welcome 3"

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        
        String[] wordArray = s.split(" ");

        int sum = 0;
        for(String str : wordArray){           //for-each loop
            try{
             sum += Integer.parseInt(str);
            }
            catch(NumberFormatException e){
            //    continue;
            }
        }
        System.out.println("Sum :" +sum);
    }
}