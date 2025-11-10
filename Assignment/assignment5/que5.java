// WAP to replace all element with 0 which is multiple of 5
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data size");
        int size = sc.nextInt();
    
        int arr[]=new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            if(arr[i] % 5 == 0){
                arr[i] = 0;
            }
        }
        System.out.println("---------");
        System.out.println("Elements after replacement : ");
         for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}