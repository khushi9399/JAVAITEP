class Test{
    public static void main(String args[]){
        int cube_side=3;
        int cube_vol=3*3*3;
        int cartoon_length= 15;
        int cartoon_breadth= 9;
        int cartoon_height= 12;
        int vol_cartoon=cartoon_length*cartoon_breadth*cartoon_height;
        int no_of_boxes=vol_cartoon/cube_vol;
        System.out.println(no_of_boxes);
    }
}