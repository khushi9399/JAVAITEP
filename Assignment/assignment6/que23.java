// Write a Java program to find the sum and average of one dimensional integer array.
class Test{
    public static void main(String args[]){
        int arr[] = {5,7,3,8,9};
        int n = arr.length; 
        float sum = 0.0f;

        for(int element : arr){
            sum += element;
            System.out.print(" " + element);
        }

        float average = sum/n;

         System.out.println();
        System.out.println("Sum is :"+sum);
        System.out.println("Average is :"+average);
    }
}