import java.util.Scanner;

public class AreaOfSqure {
    public  static void main(String[] args ){

    Scanner scan = new Scanner(System.in) ;
    System.out.print("Enter the side of the square ");
   
     int side =  scan.nextInt();
     int area = side * side ;
     
     System.out.println("The area of the square is " + area);

    }
}


