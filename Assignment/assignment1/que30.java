class Test{
    public static void main(String args[]){
        int tile_len=5;
        int tile_bre=8;
        int floor_len=200;
        int floor_wid=400;
        int tile_area=tile_len*tile_bre;
        int floor_area=floor_len*floor_wid;
        int total_tiles=floor_area/tile_area;
        System.out.println(total_tiles);
    }
}