// A
// AB
// A C
// A  D
// ABCDE
class Test{
    public static void main(String args[]){
       
        for(int i = 1; i<=5; i++){
             char a = 'A';
            for(int j = 1; j<=i; j++){
                if(i == j || i == 5 || j == 1 ){
                    System.out.print(a);      
                  
                }else{
                    System.out.print(" ");
                }
                     a++;
                                  
                }
                
                 System.out.println();
                 
              }
                
            }
        }

