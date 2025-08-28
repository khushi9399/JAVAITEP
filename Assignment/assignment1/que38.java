class Test{
    public static void main(String args[]){
        int volume=1287;
        int radius=10;
        double height=volume/3.14*radius*radius;
        double surface_area=2*3.14*radius*(height+radius);
        System.out.println(surface_area);
    }
}