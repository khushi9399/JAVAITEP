//  Write a Java program to find the largest and smallest element of an array.

 class Test {
    public static void main(String[] args) {
        int arr[] = {25, 10, 45, 5, 60, 30};  
        
        int smallest = arr[0];
        int largest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        System.out.println("Smallest element = " + smallest);
        System.out.println("Largest element = " + largest);
    }
}
