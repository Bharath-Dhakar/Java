import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int facto = 1;

        for (int i = n; i > 1; i--) { // i = 5 yes 4
            facto = facto * i;

        }
        System.out.print(facto);
    }
}
