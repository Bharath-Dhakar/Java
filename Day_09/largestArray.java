public class largestArray {

public static int LargestNum(int numbers[]){
    int max = numbers[0];


    for(int i  = 0  ;  i  < numbers.length ; i++){
         if(max < numbers[i]){
             max =  numbers[i];
         }
        
        
    }

    return max ;
}

    public static void main(String[] args) {

        int numbers[] = { 76 ,98 , 83 , 8} ;

      int max  =   LargestNum(numbers) ;

      System.out.println( "largest number is :  " +max);
        
    }
    
}
 