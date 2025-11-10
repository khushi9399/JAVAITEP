//  WAP to enter mobile of user and check wheter it is valid or invalid.
//    [length must be 10, all letter must be digit]

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile number of user :");
        String number = sc.nextLine();

        boolean isValid = true;

        for (int i = 0; i < number.length(); i++) {         // Check each character
            char ch = number.charAt(i);
            
            if (!Character.isDigit(ch)) {                  // Character.isDigit(ch) → checks if a character is 0–9.  
                isValid = false;
                break;
            }
        }

        if (isValid && number.length() == 10 ) {       
            System.out.println("Valid mobile number!");
        } else {
            System.out.println("Invalid number! Number should contain atleast 10 digit");
        }
    }
}