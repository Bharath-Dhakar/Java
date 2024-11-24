
// Brute Force
public class ArraySubSum {

    
    public static void sub(int numbers[]) {
        int sum  =  0  ; 
        int maxSum  =  Integer.MIN_VALUE ;      

        for (int i = 0; i < numbers.length; i++) {

            int start = i; // 0 , 1 , 2
           
            for (int j = i; j < numbers.length; j++) {
                int end = j; // 0 , 1 , 2 // 1 , 2 // 2
                sum  =  0  ;
                for (int k = start; k <= end; k++) {
                    sum += numbers[k];
                     
                }
              
              if(maxSum < sum){
                maxSum =  sum ; 
              }

                System.out.println( "[" + sum + "]");
               
            }

        }

        System.out.println( "max sum  = " + maxSum);
    }

    public static void main(String[] args) {

        int numbers[] = { 4, 5, 7 };
        sub(numbers);

    }

}


// (0 , 0) =  4  , (0 , 1 ) = 4 5 , (0 , 2) =  4 5 7 
// ( 1 , 1) = 5  ( 1 , 2 ) = 5 7
// (2 ,2 )  = 7