// 26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
// 	Percentage >= 90% : Grade A 
// 	Percentage >= 80% : Grade B 
// 	Percentage >= 70% : Grade C 
// 	Percentage >= 60% : Grade D 
// 	Percentage >= 40% : Grade E 
// 	Percentage < 40% : Grade F
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of physics");
        int physics = sc.nextInt();
        System.out.println("enter marks of chemistry");
        int chemistry = sc.nextInt();
        System.out.println("enter marks of Biology");
        int biology = sc.nextInt();
        System.out.println("enter marks of Maths");
        int maths = sc.nextInt();
        System.out.println("enter marks of Computer");
        int computer = sc.nextInt();

        int totalSum = biology + computer + maths + physics + chemistry;
        double percentage = totalSum/5.0;
        System.out.println("your percentage = " + percentage);
        
        //calculate grade
        if(percentage >= 90) System.out.println("Grade A");
        else if(percentage >=80) System.out.println("Grade B");
        else if(percentage >=70) System.out.println("Grade C");
        else if(percentage >=60) System.out.println("Grade D");
        else if(percentage >=40) System.out.println("Grade E");
        else  System.out.println("Grade F");

    }
}