class Rectangle{
    private float length;
    private float breadth;

    public void setLength(float length){
        this.length=length;

    }
       public void setBreadth(float breadth){
        this.breadth=breadth;

    }
    public void display(){
        System.out.println("length="+length);
        System.out.println("breadth="+breadth);
       
    }

    public void Calculate(){
        System.out.println("Area of Rectangle is : "+length*breadth);
        
    }
}
class Test{
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.setLength(8.6f);
        r.setBreadth(9);
        r.display();
        r.Calculate();
      
    }
}