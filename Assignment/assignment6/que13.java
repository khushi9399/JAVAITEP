// Find the first repeating element in array of integers

import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("Element "+ (i+1)+ " : " + arr[i]);
        }

        for(int i = 0; i < n; i++){
            boolean flag = false;
            for(int j = i + 1; j < n; j++){
                if(arr[j] == arr[i]) flag = true;
            }
            if(flag){
                System.out.println("The first repeating element is " + arr[i]);
                break;
            }
        }

    }
}