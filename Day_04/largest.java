import java.util.Scanner;

public class largest {

    public static void main (String args[] ){
         Scanner Sc  =  new Scanner(System.in) ;
         System.out.println("Enter tree numbers :");
         int num1 = Sc.nextInt() ;
         int num2 = Sc.nextInt() ;
         int num3 = Sc.nextInt() ;

         if(num1>=num2 && num1 >= num3){
            System.out.println("Largest Number is :"+" "+num1);

         }else if(num2 >= num3){
            System.out.println("Largest Number is :"+" "+num2);
         }else{
            System.out.println("Largest Number is :"+" "+num3);
         }

    }

}