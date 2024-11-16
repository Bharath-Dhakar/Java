public class Question {
    public static void main(String[] args) {
        
        for(int i  =  1 ;  i <= 4 ; i++){
            for (int spaces = 1; spaces <= (4 - i); spaces++) {
                System.out.print(" ");
            }
            for(int j = 1 ;  j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
