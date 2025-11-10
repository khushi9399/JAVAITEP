// 7. Custom Exception

// 👉 Create your own exception InvalidAgeException. If age < 18, throw the exception.


import java.util.Scanner;
class InvalidAgeException extends Exception {
    InvalidAgeException() {                         //InvalidAgeException Constructor
        super("You are not elligible to vote");
    }
}

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    try{
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        
        if(age < 18){
            throw new InvalidAgeException();
        }
        System.out.println("You are elligible to vote");
    }

    catch(InvalidAgeException e){
        // e.printStackTrace();
        System.out.println(e.getMessage());
    }
    }
}

