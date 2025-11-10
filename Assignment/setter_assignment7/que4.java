class Car{
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand){
        this.brand=brand;

    }
    public void setModel(String model){
        this.model=model;

    }
    public void setYear(int year){
        this.year=year;

    }
    public void display(){
        System.out.println("Brand="+brand);
         System.out.println("Model="+model);
          System.out.println("Year="+year);
    }
}
class Test{
    public static void main(String args[]){
        Car c=new Car();
        c.setBrand("Toyota");
        c.setModel("Fortuner");
        c.setYear(2023);
        c.display();
    }
}