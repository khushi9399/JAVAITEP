// Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

// Example 1:
// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.

// Example 2:
// Input:
// N = 10, S = 15
// A[] = {1,2,3,4,5,6,7,8,9,10}
// Output: 1 5
// Explanation: The sum of elements 
// from 1st position to 5th position
// is 15.z 
// 1 <= N <= 105
// 1 <= Ai <= 109

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your target which sum you want : ");
        int target = sc.nextInt();
        System.out.print("Enter size of an array :");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
          int sum = 0;
            for(int j = i; j < n; j++){
              sum = sum + arr[j];
              if(sum > target){
                  break;
              }
              else if(sum == target){
                System.out.println("Sum is between " +(i+1)+ " position to "+(j+1)+ " position.");
                break;                       // if we wan't only 1 pair than put break
              }
            }
            if(sum==target) break;
        }

    }
}