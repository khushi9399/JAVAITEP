class Equals{
        String s1 ;
        String s2 ;
       public boolean compare(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i))
             return false;
        }
        return true;
       }
       
}

class Test{
    public static void main(String args[]){
     Equals e = new Equals();
     boolean result = e.compare("Sonali","Mohan");
     if(result == false){
        System.out.println("Not equal");
     }else{
        System.out.println("Equal");
     }
    }
}