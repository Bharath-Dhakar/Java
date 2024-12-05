import java.util.Arrays;

public class anagrams {

public static boolean Check(String  str ,  String str2){

if(str.length() == str2.length()){

        char[] charArray1 = str.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
}


 return false ; 
}
    public static void main(String[] args) {

        String str = "pop" ;
        String str2 = "ppo" ;  
        System.out.println(Check(str, str2));
    }
    
}
