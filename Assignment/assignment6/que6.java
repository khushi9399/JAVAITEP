//  Sort the array of 0s , 1s and 2s.
import java.util.Scanner;
class Test{
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of elements : ");
    int n = sc.nextInt();
    System.out.println("Enter "+n+ " elements");
    int arr[] = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }

      for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(arr[i] == 2 && arr[j] == 1 || arr[j] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
      }
      for(int i = 0; i<n; i++){
        System.out.print(arr[i]+ " ");
      }
    }
}
