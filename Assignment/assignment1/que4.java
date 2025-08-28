class Test{
    public static void main(String args[]){
        int length= 300;
        int breadth= 150;
        int area_of_plot,convert_into_square_m,total_cost;
        area_of_plot= length*breadth;
        convert_into_square_m= area_of_plot/100;
        total_cost= convert_into_square_m*6;
        System.out.println(total_cost);
    }
}