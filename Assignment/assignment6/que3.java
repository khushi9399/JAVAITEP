//  Write a program to reverse the array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");       //take array from user
        int n = sc.nextInt();

        System.out.println("Enter " +n+ " elements");      
        int arr[] = new int[n];
        
        for(int i = 0; i< n; i++){
         arr[i] = sc.nextInt();
        }

        // int arr[]  = {1,8,9,6,7};                         
        int temp = 0;
        for(int i = 0; i<arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        
        for(int i=0; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
