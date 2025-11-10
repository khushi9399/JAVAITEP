// WAP to program calaculate the sum of all even element and all odd element of array

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data size");
        int num = sc.nextInt();

        int arr[]=new int[num];

        for(int i=0; i<num; i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
            // sum = sum+arr[i];
        }
        int i=0;
        int evenSum = 1;
        int oddSum = 0;
        for(i=0; i<num; i++){
        if(arr[i]%2 == 0){
            evenSum += arr[i]; 
        }else if(arr[i]%2 == 1){
            oddSum += arr[i];
        }
        }
        System.out.println("Sum of all even element is "+evenSum);
        System.out.println("Sum of all odd element is "+oddSum);


            } 
       }
