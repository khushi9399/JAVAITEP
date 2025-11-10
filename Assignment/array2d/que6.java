import java util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of cols: ");
        int c = sc.nextInt();
        
        int arr[][] = new int[m][n];
        
       for(int r = 0; r<m; r++){
        int maxSum = 0;
        int maxRow = 0;
        int sum = 0;
      
        for(int c = 0; c<n; c++){
           Sum += arr[r][c]; 
        }
        if(Sum > maxSum){
             maxSum = sum;
             sum = r;
        } 
        for
        
        
       }

    }
}
// class Test{
// public static void main(String args[]){
//         int arr[][]={
//             {1,2,3,4},
//             {3,1,9,9},
//             {8,9,0,1}
//         };  
//         int sum1 = 0;
//         int sum2 = 0;
//         int sum3 = 0;
       
//         for( int r = 0; r<3; r++){
//             for( int c = 0; c<=3; c++){
//                 if(r == 0 && c<=3){
//                     sum1 = sum1 + arr[r][c];
//                 }else if( r == 1 && c>=3){
//                     sum2 = sum2 + arr[r][c];
//                 }else if( r == 2 && c<=3){
//                     sum3 = sum3 + arr[r][c];
//                 }
                
//                 }
//             }
//             if( sum1 > sum2 && sum1 > sum3){
//                     System.out.println(sum1);
//                 }else if(sum2 > sum1 && sum2 > sum3){
//                     System.out.println(sum2);
//                 }else if(sum3 > sum1 && sum3 > sum2){
//                     System.out.println(sum3);
//         }
//     }
// }
 