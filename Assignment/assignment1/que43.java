class Test{
    public static void main(String args[]){
      int height=4;
      int slantHeight=5;
      int cost=10;
      double radius=Math.sqrt((slantHeight*slantHeight)-(height*height));
      double area=3.14*radius*radius;
      double costPolishing=area*10;
         System.out.println(costPolishing);
    }
}