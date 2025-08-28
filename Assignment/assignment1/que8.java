class Test{
    public static void main(String args[]){
        int altitude=20;
        double area=0.8;
        double into_square_cm=area*1000; //cm square
        double base=(2*into_square_cm)/altitude;
        System.out.println("base of triangle is "+base);  
    }
}