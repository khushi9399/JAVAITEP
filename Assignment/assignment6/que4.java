//  Write a program to sort the array

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();

        System.out.println("Enter " +n+ " elements");
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
                 arr[i] = sc.nextInt();
        }
        int temp = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i]; 
                    arr[i] = temp;
                }
                else{
                    continue;
                }
            }
        }
        System.out.print("Elements after sorting : ");
        for(int i  = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
