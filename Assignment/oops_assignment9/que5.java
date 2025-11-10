// Create an Object having two properties and four behaviours
// (add,substract,multiply,divide) to perform desired operation.object must have setter and getter and keep all properties private.

class Calculate{
    private int number1;
    private int number2;

    // public Calculate(int nummber1, int number2){
    //     this.number1 = number1;
    //     this.number2 = number2;
    // } 
    public void setValue(int number1, int number2){       //Setter
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1(){                             //Getter
        return this.number1;
    }
    public int getNumber2(){
        return this.number2;
    }

    public void add(){                                     //Operation
        int add = this.number1 + this.number2;
        System.out.println(add);
    }
    public void substract(){
        int substract = this.number1 - this.number2;
        System.out.println(substract);
    }
    public void multiply(){
        int multiply = this.number1 * this.number2;
        System.out.println(multiply);
    }
    public void divide(){
        int divide = this.number1/this.number2;
        System.out.println(divide);
    }
}
class Test{
    public static void main(String args[]){
    Calculate c = new Calculate();
    c.setValue(12,2);
    System.out.println("First number is : "+c.getNumber1());
    System.out.println("Second number is : "+c.getNumber2());
    c.add();
    c.substract();
    c.multiply();
    c.divide();
    }
}