class Test{
    public static void main(String args[]){
       int baseRatio=8;
       int baseHeight=5;
       int area=320;
       double ratio=Math.sqrt((2*area)/(baseRatio*baseHeight));
       double actualBase=baseRatio*ratio;
       double actualHeight=baseHeight*ratio;
       System.out.println(actualBase);
        System.out.println(actualHeight);
    }
}  