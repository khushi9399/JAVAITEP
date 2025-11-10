// bubble sort
class Test{
    public static void main(String args[]){
        int arr[] = {1,5,7,4,33,45,15};
        int n = arr.length;

        System.out.println("Before sorting ");

        for(int element : arr){
            System.out.print(" " + element);
        }

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                --j;
            }

            arr[j+1] = key;

        }

        System.out.println("\nAfter sorting ");

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}