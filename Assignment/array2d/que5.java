// Sum of even digit
// Sum of odd digit
class Test{
    public static void main(String args[]){
        int arr[][]={
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        int even = 0;
        int odd = 0;
    
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                if(arr[r][c] % 2 == 0){
                      even = even + arr[r][c];
                }else{
                     odd = odd + arr[r][c];
                }
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
