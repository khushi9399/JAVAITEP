// Write a Java program to swap first and last element of an integer 1-d array.

class Test{
    public static void main(String args[]){
        int arr[] = { 4,6,8,2,8 };
        int n = arr.length;

        for(int element : arr){
            System.out.print(" " + element);
        }

        System.out.println("\nAfter Swapping first and last digit of array :");

        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}