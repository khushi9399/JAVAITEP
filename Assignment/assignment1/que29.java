class Test{
    public static void main(String args[]){
        int tile_len=10;
        int tile_area=tile_len*tile_len;
        int floor_area=800*900;
        int total_tiles=floor_area/tile_area;
        System.out.println(total_tiles);
    }
}