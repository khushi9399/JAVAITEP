class Test{
    public static void main(String args[]){
        int a= 10;
        int b= 9;
        int perimeter= 36;
        int c= perimeter-a-b; //perimeter of triangle = a+b+c
        int semi_perimeter= (a+b+c)/2;
        double area=Math.sqrt(semi_perimeter*(semi_perimeter-a)*(semi_perimeter-b)*(semi_perimeter-c));
        System.out.println((int)area);  
    }
}