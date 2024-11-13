public class Question3 {
    public static void main(String args[]) {
        int x, y, z;  // done
        x = y = z = 2; // x = 2 , y = 2 , z =2 
        x += y;  // 4
        y -= z; //0
        z /= (x + y);  //  2 / (4 + 0)   = 0.5 = 0 {because data type is int }  so ANS is 0
        System.out.println(x + " " + y + " " + z); // 4 0 0 
    }
}
