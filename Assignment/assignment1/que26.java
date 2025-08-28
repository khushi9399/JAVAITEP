class Test{
    public static void main(String args[]){
        int path_len=120;
        float path_br=2.4f;
        float brick_len=24f/100;
        float brick_wid=15f/100;
        float path_area=path_len*path_br;
        float brick_area=brick_len*brick_wid;
        float num_brick=path_area/brick_area;
        System.out.println(num_brick);
    }
}