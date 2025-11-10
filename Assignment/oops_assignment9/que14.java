// Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R

import java.util.Scanner;
class MathOperation{
      private int x;
      private int y;                       //ask from anisha about result
      private int r;
    
public void init(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of X : ");
     x = sc.nextInt();
    System.out.print("Enter the value of Y : ");
     y = sc.nextInt();
}

public int add(){
    r = this.x + this.y;
    return r;
}

public int multiply(){               
    r = this.x * this.y;
    return r;
}

public int power(){
    return Math.pow(x,y);
}

public void display(){
    System.out.println("Result is : "+r);
}

}
class Test{
    public static void main(String args[]){
    MathOperation m = new MathOperation();
    m.init();
    System.out.println("Addition is : "+m.add());
    System.out.println("Multiplication is : "+m.multiply());
    System.out.println("Power is : "+m.power());
    m.display();
    }
}
