import java.util.Scanner;

public class oneToN {
    
    public static void main(String[] args) {
        Scanner Scan = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = Scan.nextInt();
        int sum = 0;

        int count = 1;
        while(count <= n){
            System.out.println(count);
            sum += count ;
            count++;
        }

        System.out.println("Sum is :" + sum);
    }

}
