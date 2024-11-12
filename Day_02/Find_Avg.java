import java.util.Scanner;

public class Find_Avg {
    public static void main(String[] args) {

        System.out.println("Enter three numbers: ");

        Scanner scan = new Scanner(System.in);
        float a = scan.nextInt();
        float b = scan.nextInt();
        float c = scan.nextInt();

        System.out.print("Avg of Numbers is:" + (a + b + c) / 3);

    }
}
