// Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
class Circle{
    public float radius;

    public Circle(float radius){
        this.radius = radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public void calculate(){
        float area = 3.14f * this.radius * this.radius;
        float circumference = 2 * 3.14f * this.radius;
        System.out.println("Area : "+area);
        System.out.println("Circumference : "+circumference);
    }
}
class Test{
    public static void main(String args[]){
    Circle c = new Circle(99);
    c.calculate();
    // c.radius=99;
    c.setRadius(34f);
    System.out.println("Updated Radius is : "+c.radius);
    c.calculate();
    }
}