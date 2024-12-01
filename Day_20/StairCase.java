public class StairCase {


        public static void Search(int matrix[][] , int key ){

            int row  =  0  , col  = matrix.length-1 ;
    
       
       while(row < matrix.length && col >= 0 ){

        if(matrix[row][col] == key){
            System.out.println("key found at : [" + row + "," + col + "]"); 
            return;
        }else if(key < matrix[row][col]){
            col--;
        }
        else{
           row++ ;
        }

       }

       System.out.println("key not found "); 
    
        }
    
    
        public static void main(String[] args) {
            int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
     
            } ;
    
         Search(matrix , 14);
    
    }
    
    }
    

