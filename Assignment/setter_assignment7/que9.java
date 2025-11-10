
class Circle{
    private double radius;

    public void setRadius(double radius){
        this.radius=radius;

    }
    public void display(){
        System.out.println("Radius="+radius);
       
    }

    public void Calculate(){
        double areaOfCircle = 3.14*radius*radius;
        double CircumferenceOfCircle = 2*3.14*radius;
        System.out.println("Area of Circle is : "+areaOfCircle);
        System.out.println("Circumference of Circle is : "+CircumferenceOfCircle);
    }
}


class Test{
    public static void main(String args[]){
        Circle c=new Circle();
        c.setRadius(6);
        c.display();
        c.Calculate();
      
    }
}