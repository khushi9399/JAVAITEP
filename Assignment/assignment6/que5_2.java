// Find occurance of an integer number in array.

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
            
            boolean b[] = new boolean[n];
            for(int i = 0; i < n; i++){                   //n = arr.length
                int count = 1;                            // b'coz it's count ourselves also
                if(b[i] == true) continue;
                for(int j = i+1; j < n; j++){
                    if(arr[i] == arr[j]){
                       count++;
                       b[j] = true;
                    }
                }
              System.out.println(arr[i]+ " occured " +count+ " times.");
            }
    }
}