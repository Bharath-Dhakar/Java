public class QueFive {
    
    public static void main(String[] args) {
        for(int i  = 1  ; i  <= 5 ; i ++){

            for(int spc =  1 ;  spc <= 5-i ; spc++){
                System.out.print(" ");
            }

            for(int j  = 1  ; j <= 5 ; j ++){
                   System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
