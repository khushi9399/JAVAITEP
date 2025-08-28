class Test{
    public static void main(String args[]){
        double Len_of_wall= 20;
        double Hei_of_wall= 2;
        double Thickness_of_wall= 0.75;
        double con_len_into_cm=Len_of_wall*100;
        double con_bre_into_cm=Hei_of_wall*100;
        double con_hei_into_cm=Thickness_of_wall*100;
        double wall_vol= con_len_into_cm*con_bre_into_cm*con_hei_into_cm;
        double Len_of_brick= 25;
        double br_of_brick= 10;
        double Thickness_of_brick= 7.5;
        double brick_vol=Len_of_brick*br_of_brick*Thickness_of_brick;
        double no_of_bricks=wall_vol/brick_vol; 
        double brick_cost_per_thousand=no_of_bricks/1000;
        double dollar_cost= brick_cost_per_thousand*900;
        System.out.println(dollar_cost);
    }
}