public class SubString {

    public static String subString(String str, int si, int ei) {

        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }

        return substr;

    }

    public static void main(String[] args) {
        String str = "HelloWorld!";
        String s1 =  "me" ;
        String s2 =  "me" ;
        String s3 =  new String("me") ;  // s1 == s2  , s3 !=  s4 or s1
        String s4 =  new String("me") ;

        System.out.println(str.substring(0, 5)); 
        System.out.println(subString(str, 0, 5));


        String  fruits[] =  {"apple", "mango" , "banana"} ;
        String largest =  fruits[0] ;

        for(int i  = 0  ;  i < fruits.length  ; i++){

            if(largest.compareTo(fruits[i]) < 0 ){
                largest = fruits[i] ;
            }

        }
        
        System.out.println(largest);


    }

}