//  WAP to program to calculate the sum of all element of array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data size");
        int num = sc.nextInt();
        int sum = 0;

        int arr[]=new int[num];

        for(int i=0; i<num; i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        System.out.println("Sum is "+sum);

            } 
       }
