// Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
// init - to input radius from user
// calc - to calculate area
// display- to display area

import java.util.Scanner;
class Calculate{
    private double radius;
    private double area;

public void init(){    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius : ");
    radius = sc.nextDouble();
}
public void calc(){

    area = 3.14 * this.radius * this.radius;
}
public void display(){
    System.out.println("The area of circle is : "+area);
}
}
class Test{
    public static void main(String args[]){
     Calculate c = new Calculate();
     c.init();
     c.calc();
     c.display();
    }
}