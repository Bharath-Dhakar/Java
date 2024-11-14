public class Reverce{
    public static void main(String[] args) {
        
        int num =  122353 ;
        int rev = 0 ;

        while ( num > 0 ){
            int lastDigit = num % 10 ;
            rev = rev * 10 + lastDigit ;
            // System.out.println(lastDigit);
            num = num / 10 ;
        }

        System.out.println(rev);
    }

}