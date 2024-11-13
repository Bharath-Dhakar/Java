public class Question4{
    public static void main(String args[]){
        int x = 9 , y=12 ;
        int a = 2 , b = 4 , c=6 ;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
                // 4/3*43 + 9 * 26 + (3 +y*4) / 50
                // 1*43 + 234 + 51 /50
                // 43 + 234 + 1 =  44 + 234 = 278 
                
        System.out.println(exp);
    }
}