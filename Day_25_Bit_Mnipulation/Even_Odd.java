public class Even_Odd {
    
    public  static void check( int n ){
        int bitMask  =  1  ;

        if((n&bitMask) ==  0){

            System.out.println("Even");

        }else{
            System.out.println("Odd");
        }

    }

    public static void main(String[] args) {
        check(3);
        
    }
}
