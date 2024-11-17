import java.util.Scanner;

public class BinaryToDec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 0;
        int decNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, power));
            n /= 10;
            power++;
        }

        System.out.println(decNum);
    }
}
