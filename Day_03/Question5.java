public class Question5 {
    public static void main  (String args[]){
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
                //  y * (2+2)  => 5 * 4  = 20
        int exp2 = (y * x / y + y * x / y);
                //  10 +  10 = 20
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
