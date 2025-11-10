//  Write a java program to implement linear search

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        
        int position = -1; // Variable to store index if found
        
        // Linear search logic
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }
        
        // Output result
        if (position == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at position: " + (position + 1)); // +1 for human-readable position
        }
        
        sc.close();
    }
}
