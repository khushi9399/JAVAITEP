// Find the Union and Intersaction of two sorted array.
// Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays. 
// Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
// Example 1:
// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5
// Explanation: 
// 1, 2, 3, 4 and 5 are the
// elements which comes in the union set
// of both arrays. So count is 5.
// Example 2:
// Input:
// 6 2 
// 85 25 1 32 54 6
// 85 2 
// Output: 
// 7
// Explanation: 
// 85, 25, 1, 32, 54, 6, and
// 2 are the elements which comes in the
// union set of both arrays. So count is 7.

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1 : ");       
        int n = sc.nextInt();
        System.out.println("Enter "+n+ " elements");            //input elements of array1
        int arr1[] = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        System.out.print(arr1[i]+ " ");
        }
        System.out.println();

        System.out.print("Enter the size of array 2 : ");
        int m = sc.nextInt();
        System.out.println("Enter "+m+ " elements");          //input elements of array2
        int arr2[] = new int[m];
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
            System.out.print(arr2[i]+ " ");
        }

        System.out.println();
        int temp[] = new int[n+m];               //take empty temp variable in which we merge elements of array1 and array2
    

        for(int i = 0; i < n; i++){
            temp[i] = arr1[i];                 //take elements of array1 in temp variable
            System.out.print(temp[i]+ " ");        
        }
        

        for(int i = 0; i < m; i++){
            temp[i] = arr2[i];               //take elements of array2 in temp variable
            System.out.print(temp[i]+ " ");
        }
        // System.out.println("After Merge Array1 and Array2 : ");

        // for(int i = 0; i<n+m; i++){
        //     // temp[i] = sc.nextInt();
        // System.out.print(temp[i]+" ");
        // }
         
         System.out.println();
        int result[] = new int[n+m];            //take an empty variable in which we add unique element also called union
        int k = 0;                              //Use a separate variable (k) to insert unique elements

        for(int i = 0; i<n+m; i++){
                if(i == 0){                    
                    result[k] = temp[i];
                    k++;
                }
                else if(temp[i] != temp[i-1]){
                    result[k] = temp[i];
                    k++;                                                                                                                                                                                                        
                }
        }
        
        for(int i = 0; i<k; i++){
        System.out.print(result[i]+ " ");
        }
    }
}
