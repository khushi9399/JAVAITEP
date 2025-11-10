//Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st person's age");
      double age1 = sc.nextDouble();

      System.out.println("Enter 2nd person's age");
      double age2 = sc.nextDouble();
      
      System.out.println("Enter 3rd person's age");
      double age3 = sc.nextDouble();

      if(age1>age2 && age1>age3){
        System.out.println("1st person is oldest");
      }else if(age2>age3 && age2>age1){
        System.out.println("2nd person is oldest");
      }else{
        System.out.println("3rd person is oldest");
      }
      if(age1<age2 && age1<age3){
        System.out.println("1st person is younger");
      }else if(age2<age3 && age2<age1){
        System.out.println("2nd person is younger");
      }else{
        System.out.println("3rd person is younger");
      }
    }
  }