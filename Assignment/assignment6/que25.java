// Write a Java program to reverse the element of an integer 1-D array.

class Test{
    public static void main(String args[]){
        int arr[] = { 5,3,2,5,6,8,9,1 };
        int n = arr.length;
        int first = 0, last = n-1;

        for(int element : arr) {
            System.out.print(" " + element);
        }

        System.out.println("\nReverse Array : ");

        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        for(int element : arr) System.out.print(" " + element);
    }
}