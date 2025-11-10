// Write a java program to impelment binary search algorithm

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,4,5,6};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter element you want to search index of : ");
        int element = sc.nextInt();
        int low = 0;
        int high = n -1;
        int mid;

        while(low <= high){
            mid = (low + high)/2;
            if(arr[mid] == element){
                System.out.println("Element found");
                break;
            } else if(arr[mid] > element){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(low > high){
            System.out.println("Element not found.");
        }
    }
}