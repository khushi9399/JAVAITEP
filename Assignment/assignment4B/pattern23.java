// a
// bc
// d f
// g  j
// klmno

class Test{
    public static void main(String args[]){
        char a = 'a';
        for(int i = 1; i<=5; i++){
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

