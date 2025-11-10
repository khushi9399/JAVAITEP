// A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.
// import java.util.Scanner;

class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a total number of classes");
      double totalClasses = sc.nextInt();

      System.out.println("Enter a total number of attended classes");
      double attendedClasses = sc.nextInt(); 

      double percentage = attendedClasses/totalClasses*100;

     if(percentage>75){
        System.out.println("Student will be allowed to sit in exam" +percentage);
     }else{
        System.out.println("Student will not be allowed to sit in exam" + percentage);
     }
    }
}