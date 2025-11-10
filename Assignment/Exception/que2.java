//Null Pointer Exception

class Test{
    public static void main(String args[]){
        String s = null;

        try{
            int c = s.length();
            System.out.println(c);
        }
        catch(NullPointerException e){
          e.printStackTrace();
          System.out.println("You Can't find length of null String");
        }
    }
}