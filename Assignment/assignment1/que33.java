class Test{
    public static void main(String args[]){
        int length= 30;
        int breadth= 20;
        int pathway1Len= 3;
        int pathway2Len= 4;
        int extraPart=pathway1Len*pathway2Len;
        int usableArea= (length*breadth)-(length*pathway1Len+breadth*pathway2Len-(extraPart));
        System.out.println(usableArea);
    }
}  