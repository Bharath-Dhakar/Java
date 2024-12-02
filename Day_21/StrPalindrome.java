public class StrPalindrome {

public static boolean  isPalindrome(String str){

    for(int i  = 0 ;  i <  str.length() ; i++){
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
            return false ;
        }
    }

    return true ; 
}

    public static void main(String[] args) {
        
        System.out.println(isPalindrome("radar")); // true
        System.out.println(isPalindrome("java")); // false
    }
    
}
