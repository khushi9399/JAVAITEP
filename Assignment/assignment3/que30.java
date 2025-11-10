//WAP to check given year is a leap year or not 
import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(year < 0){
            System.out.println("Invalid input");
        }
        if(year%4 != 0){
            System.out.println("This is not a leap year");
        }else {
            if(year%4 == 0 ){
            if(year % 100 == 0 && year % 400 != 0){
                System.out.println("It is not a leap year");
            }else{
                 System.out.println("It is a leap year");
            }
        }
        }
        
    }
}