public class Binomial {

    public static int facto(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }

    public static int BinomialCofficient(int n, int r) {

        int c = n - r;

        int result = facto(n) / ( facto(r) * facto(c) );

        return result;
    }

    public static void main(String[] args) {
      
        System.out.println( BinomialCofficient(5, 2));
    }
}
