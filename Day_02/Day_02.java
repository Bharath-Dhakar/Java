import java.util.*;

public class Day_02 {
    public static void main(String[] args){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

       //  Variables
        int a =  10 ;
        int b =  40 ;
        String name = "Musk";
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);

        a = b ;
        System.out.println(a);

        // Input in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sure you want to quit? ");
        long  input =  sc.nextLong();
        System.out.println(input);

        //type Casting
        float marks  =  70.345f;
        int mark =  (int) marks ;
        System.out.println(mark);
    }
}
