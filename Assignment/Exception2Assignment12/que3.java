// 3. ArrayIndexOutOfBoundsException

// 👉 Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// // Expected
// Enter index: 8
// java.lang.ArrayIndexOutOfBoundsException caught

import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];

    System.out.println("Enter 5 numbers :");

    for(int i = 0; i < 5; i++){
        arr[i] = sc.nextInt();
    }

    try{
        System.out.println("Enter the index value :");
        int idx = sc.nextInt();
        System.out.println("Element at index "+idx+ " is " +arr[idx]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e+ " --Invalid index");
    }
    }
}