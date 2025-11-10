// Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

// Example 1:
// Input : 
// N = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output : 
// 1  3  2  11  6  -1  -7  -5

// Example 2:
// Input : 
// N=8
// arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
// Output :
// 7  9  10  11  -5  -3  -4  -1

// import java.util.Scanner;
class Test{
    public static void main(String args[]){
       int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
       
      
       for(int i = 0; i < arr.length; i++){
          for(int j = i; j < arr.length-1
          
          
          
          
          
          
          ; j++){
            if(arr[j] < arr[j+1]){                             
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
            }
          }
       }
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }
    }
}
