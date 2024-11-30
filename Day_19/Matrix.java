import java.util.Scanner;

public class Matrix {

    public static boolean search(int matrix[][] , int key ){

        for (int i = 0; i <  matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

               if(matrix[i][j] == key){
                System.out.print  ("found at [" + i + "," + j + "]" );
                return true;
               }

            }

        }

        return false ;

    }


    public static void LargestNum(int matrix[][]  ){

        int largest =  matrix[0][0] ; 

        for (int i = 0; i <  matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

               if(largest < matrix[i][j]){
                
                largest = matrix[i][j] ;
                
               }

            }

        }

        System.out.println( " \n Largest Number is  : " + largest );
    }
    
    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        int r = matrix.length;
        int c = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                matrix[i][j] = sc.nextInt();

            }

        }

        System.out.print  ( "your matrix : \n");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print  (matrix[i][j] + " ");

            }
            System.out.println();
        }


      search(matrix, 4) ;
      LargestNum(matrix) ;

    }
}