import java.util.Scanner;
class Trim{
    private String data;

    public Trim(String data){   //Constructor
        this.data = data;
    }
    public String getTrim(){
      char arr[] = data.toCharArray();
      for(int i = 0, j=arr.length-1; true;){
        if(arr[i] != ' ' && arr[j] != ' ')
            break;
        if(arr[i] == ' ')
            arr[i++] ='\0';
        if(arr[j] == ' ')
            arr[j--] = '\0';
      } 
      return new String(arr);
    }
}
class Test{
    public static void main(String args[]){
      Trim s1 = new Trim("   Hello   ");
      String s =s1.getTrim();
      System.out.println("&"+s+"&");       //&Hello&
    }
}