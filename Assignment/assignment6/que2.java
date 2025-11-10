// Find minimum and maximum element in array
// import java.util.Scanner;
class Test{
    public static void main(String args[]){
      
        int arr[] = {4,6,1,7,35};
        int temp = 0;
    
       
        for( int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        int min = arr[0];
        int max = arr[arr.length-1];
         System.out.println("minimum value is "+min);
         System.out.println("maximum value is "+max);
    }
   
}