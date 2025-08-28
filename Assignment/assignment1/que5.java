class Test{
    public static void main(String args[]){
        int cost_of_fence=1600;
        int length_of_park=20;
        int rate_per_m_square=25;
        int total_area=cost_of_fence/rate_per_m_square;
        int breadth_of_park=total_area/length_of_park;
        int perimeter=2*(length_of_park+breadth_of_park);
        System.out.println(breadth_of_park);
        System.out.println(perimeter);
    }
}