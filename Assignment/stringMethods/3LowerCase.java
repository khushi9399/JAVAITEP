class Test{
    public static void main(String args[]){
        String str = "RAmSEEtA";
        String lowerStr = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                lowerStr = lowerStr + (char)(str.charAt(i)+32);
            }
            else{
                lowerStr = lowerStr + str.charAt(i);
            }
            }
        System.out.println(lowerStr);
        }
    }
