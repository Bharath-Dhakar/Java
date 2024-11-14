import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = Scan.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = Scan.nextInt();
        System.out.println("Enter Operator [+ , - , * , / , % ] ");
        char operator  =  Scan.next().charAt(0) ;

        switch (operator) {
            case '+': System.out.println(num1 + num2);
                break;
            case '-': System.out.println(num1 - num2);
                break;
            case '*': System.out.println(num1 * num2);
                break;    
            case '/': System.out.println(num1 / num2);
                break;  
            case '%': System.out.println(num1 % num2);
                break;    
            default:System.out.println(" Wrong input :( ");
                break;
        }


    }
}
