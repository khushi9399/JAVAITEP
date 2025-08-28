class Test{
    public static void main(String args[]){
        int length= 15;
        int breadth= 8;
        int height= 5;
        int wall_len=15;
        int wall_br=10;
        int wall_hi=8;
        int length_into_m= wall_len*100;
        int breadth_into_m= wall_br*100;
        int height_into_m= wall_hi*100;
        int vol_of_wall=length_into_m*breadth_into_m*height_into_m;
        int vol_of_one_brick=length*breadth*height;
        int no_of_brick=vol_of_wall/vol_of_one_brick;
        System.out.println(no_of_brick);
    }
}