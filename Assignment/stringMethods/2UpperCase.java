class Test{
    public static void main(String args[]){
        String str = "KHushisaHu";
        String upperStr = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
                 upperStr = upperStr + (char)(str.charAt(i)-32);
            else
                 upperStr = upperStr + str.charAt(i); 
        }
        System.out.println(upperStr);
    }
}