// WAP To enter name of user and check whether it valid name or not.

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name of user :");
        String name = sc.nextLine();

        boolean isValid = true;

        for (int i = 0; i < name.length(); i++) {         // Check each character
            char ch = name.charAt(i);
            
            if (!Character.isLetter(ch) && ch != ' ') {   // Allow letters and space only  //(!Character.isLetter(ch) && ch != ' ' → means the character is invalid)
                isValid = false;
                break;
            }
        }

        if (isValid && name.length() > 0) {       //isValid →all characters were letters or spaces  //name.length() > 0 → the user did not enter an empty string
            System.out.println("Valid name!");
        } else {
            System.out.println("Invalid name! Name should contain only letters and spaces.");
        }
    }
}