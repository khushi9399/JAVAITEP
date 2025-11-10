//  Write a java program to find all possible palindrom of given String.
// 	Sample Input: “aaabbbacccababacccaabb”
import java.util.Scanner;
import java.util.LinkedHashSet;
class Sequence{
    private String data;
    public Sequence(String data){     //Constructor
        this.data = data;
    }
    public boolean isPalindrome(){
       int i=0;
       int j = data.length()-1;
       while(i<j){
         if(data.charAt(i) != data.charAt(j))
           return false;
         i++;
         j--;  
       }
       return true;
    }
    public LinkedHashSet<String> getAllPalindrome(){
       LinkedHashSet<String> al = new LinkedHashSet<String>();
       for(int i=0; i<data.length()-1; i++){
         for(int j=i+1; j<data.length(); j++){
             String s = "";
             for(int k=i; k<=j; k++)
               s = s + data.charAt(k);
             Sequence seq = new Sequence(s);
             boolean status = seq.isPalindrome();
             if(status)
               al.add(s);
         }
       }
       return al;
    }
}
class Test{
    public static void main(String args[]){
      Sequence s = new Sequence("aaabbbacccababacccaabb");
      LinkedHashSet<String> al =  s.getAllPalindrome();
      for(String element : al)
        System.out.println(element);
    }
}