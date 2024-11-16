public class function {

    public static int Multiplication(int a, int b) {

        int product = a * b;
        return product;
    }

    public static int facto(int n) {

        int facto = 1  ;

        for(int i = 1 ;  i <= n ;i++){
            facto *= i ;
        }

        
        return facto;
    }

    public static void main(String args[]) {


        int result = Multiplication(5, 6);
        int factorial =  facto (5) ;
        System.out.println(result);
        System.out.println(factorial);

    }
}