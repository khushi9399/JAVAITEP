public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(arr);

        rotate(arr);

        System.out.println("\nArray after one rotation:");
        printArray(arr);
    }

    // Function to rotate array by one position
    public static void rotate(int[] arr) {
        int last = arr[arr.length - 1]; // store last element

        // shift elements to right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // put last element at first position
    }

    // Function to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
