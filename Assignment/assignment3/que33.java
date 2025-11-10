//W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 
import java.util.Scanner;
class Test{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side 1 of triangle");
        int a = sc.nextInt();
        System.out.println("enter side 2 of triangle");
        int b = sc.nextInt();
        System.out.println("enter side 3 of triangle");
        int c = sc.nextInt();
        
        if(a==b && b==c){
            System.out.println("equilateral triangle");
        }
        else if(a==b || b==c || a==c){
            System.out.println("isosceles triangle");
        }
        else{
            System.out.println("scalene triangle");
        }
    }
}