import java.util.Scanner;

public class SumEvenOdd {

    public static void main(String[] args) {
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This program calculates the sum of even and odd numbers you enter.");
        
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.print("Enter 1 to continue or 0 to exit: ");
            choice = scanner.nextInt();

        } while (choice != 0);

        System.out.println("\nSum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        scanner.close();
    }
}
