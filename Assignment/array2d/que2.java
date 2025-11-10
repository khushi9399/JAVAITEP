// // Show values right to left diagonal
class Test{
    public static void main(String args[]){
        int arr[][]={
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                if(r+c == 2){
                    System.out.print(arr[r][c] +" ");
                }
            }
        }
    }
}
