import java.util.Scanner;

public class DecToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 0;
        int Binary = 0;

        while (n > 0) {
            int lastDigit = n % 2;
            Binary = Binary + (lastDigit * (int) Math.pow(10, power));
            n /= 2;
            power++;
        }

        System.out.println(Binary);
    }

}
