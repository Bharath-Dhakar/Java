import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String str = "abcd";
        String str2 = new String("xyz");
        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);

        String name;
        String nameLast;

        name = sc.nextLine();
        nameLast = sc.nextLine();
        String Fullname = name + "  " + nameLast;
        System.out.println(Fullname);
        System.out.println(Fullname.charAt(0));

        // Fullname.charAt(i)
    }

}