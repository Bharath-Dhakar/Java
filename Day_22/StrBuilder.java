public class StrBuilder {
    
    public static void main(String[] args) {
        StringBuilder sb  =  new StringBuilder("");
        for(char ch = 'a' ;  ch <='z' ;  ch++){
             sb.append(ch) ;
        }

        //  TC =  O(26)
        // if we use str TC  O(26 * n^2)
        System.out.println(sb);

    }
}
