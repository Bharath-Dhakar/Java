public class leapYear {

    public static void main(String[] args) {
        int year = 2028;
        if ((year % 4 == 0) || (year % 100 == 0) || (year % 400 == 0)) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
