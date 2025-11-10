/*
Find the first non-repeating elment in given array of integers
Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.
Example 1:
Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is 
the only number occuring once.
Hence, the output is 3.

Example 2:
Input : arr[] = {1, 1, 1}
Output : 0
*/

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
            boolean flag = true;
            for(int j = i + 1; j < n; j++){
                if(arr[j] == arr[i]) flag = false;
            }
            if(flag){
                System.out.println("The first non-repeating element is " + arr[i]);
            }
        }

    }
}