class Test{
    public static void main(String args[]){
        int cube_edge=7;
        int a=7;
        int b=4;
        int c=8;
        int cube_vol=cube_edge*cube_edge*cube_edge;
        int cuboid_vol=a*b*c;
        if(cube_vol > cuboid_vol){
            System.out.println("cube vol is greater than cuboid vol");
        }else{
                        System.out.println("cuboid vol is greater than cube vol");

        }
            }
    }