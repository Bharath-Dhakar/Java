import java.util.*;

public class Quetion04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Items Price: ");
        float pencil = scan.nextFloat();
        float pen = scan.nextFloat();
        float eraser = scan.nextFloat();


        float total = pencil + pen + eraser;
        System.out.println("Total Price :" + total);
        float newTotal = total + 0.18f * total;
        System.out.println("Price With 18% gst  :" + newTotal);
    }
}
