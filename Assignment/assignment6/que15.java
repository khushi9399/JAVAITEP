// Sub with equal 0s and 1s
// Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. //In array equal number of 0 and 1 
// Example 1:
// Input:
// n = 7
// A[] = {1,0,0,1,0,1,1}
// Output: 8
// Explanation: The index range for the 8 
// sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
// (4, 5) ,(2, 5), (0, 5), (1, 6)  //This is index
// Example 2:
// Input:
// n = 5a

// A[] = {1,1,1,1,0}
// Output: 1
// Explanation: The index range for the 
// subarray is (3,4).

class Test{
    public static void main(String args[]){
        int arr[] = {1,0,0,1,1};
        int count = 0;
        int n = arr.length;

        for(int element : arr){
            System.out.print(" "+element);    // using for each loop to take elements of array
        }
        System.out.println();

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                arr[i] = -1;                // replace all zeroes to -1
            }
        }

        for(int i = 0; i < n; i++){
            int sum = 0; 
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == 0)
                  count++;
            }
        }
        System.out.println("Total sub arrays with equal 1s and 0s is "+count);
    }
}


// another approach

// class Test{
//     public static void main(String args[]){
//       int arr[] = {1,0,1,1,0,0};
//       int count = 0;
//       for(int i = 0; i<arr.length; i++){
//         int sum = 0;
//         for(int j = i; j<arr.length; j++)
//            if(arr[j] == 0){
//              sum -= 1;
//            }
//            else{
//             sum += 1;
//            }
//            if(sum == 0)
//              count++;
//        } 
//        System.out.println("Number of subarrays of 0 and 1 is : "+count); 
//     }
// }