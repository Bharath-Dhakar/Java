public class Question3 {

  public static void main(String[] args) {
     
      int arr[][] = {
          {4, 7, 8},
          {8, 8, 7}
      };

     
      
      int trans[][] = new int[3][2];

      
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[0].length; j++) {
              trans[j][i] = arr[i][j];
          }
      }

      
      System.out.println("Original Matrix:");
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[0].length; j++) {
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }

      
      System.out.println("\nTransposed Matrix:");
      for (int i = 0; i < trans.length; i++) {
          for (int j = 0; j < trans[0].length; j++) {
              System.out.print(trans[i][j] + " ");
          }
          System.out.println();
      }
  }
}
