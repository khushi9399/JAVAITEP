// WAP to Enter n element in array and print array
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data size");
        int num = sc.nextInt();

        int arr[]=new int[num];

        for(int i=0; i<num ;i++){
            System.out.println("Enter "+(i+1)+ "element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Given data...");
        for(int i = 0; i<num ; i++)
        System.out.println(arr[i]);
            } 
       }
