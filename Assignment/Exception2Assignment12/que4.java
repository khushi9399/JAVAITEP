// 4. NullPointerException

// 👉 Declare a String = null. Try to call length() on it. Handle the exception.

// // Expected
// java.lang.NullPointerException caught

class Test{
    public static void main(String args[]){
        String s = null;

        try{
            int result = s.length();
        }
        catch(NullPointerException e){
          e.printStackTrace();
          System.out.println("You Can't find length of null String");
        }
    }
}