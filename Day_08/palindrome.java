import java.util.Scanner;

public class palindrome {
  



public static void isPalindrome(int n) {
    int original = n; 
    int newNum = 0;   

    // Reverse the number
    while (n > 0) {
        int lastDigit = n % 10;       
        newNum = newNum * 10 + lastDigit; 
        n /= 10;                     
    }

    if (original == newNum) {
        System.out.println("The number is a palindrome");
    } else {
        System.out.println("The number is not a palindrome");
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number:");
        int n = sc.nextInt(); 

        isPalindrome(n); 
  
}

}
