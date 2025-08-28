class Test{
    public static void main(String args[]){
        int length_of_tiles= 13;
        int breadth_of_tiles= 7;
        int length_of_region= 520;
        int breadth_of_region= 140;
        int area_of_region, area_of_one_tiles;
        area_of_region= length_of_region*breadth_of_region;
        area_of_one_tiles= length_of_tiles*breadth_of_tiles;
        int total_tiles= area_of_region/area_of_one_tiles;
        System.out.println("total tiles is " +total_tiles);
    }
}