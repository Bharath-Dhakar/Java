import java.util.Scanner;

public class LowerVowels{


public static int VowelCount(String str){


    int count =  0 ;

    for(int i = 0  ;  i < str.length() ; i++){

        char ch =  str.charAt(i) ;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

            count++ ;

        }
        
    }

    return count ;
}

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a str :");
        String str =  sc.nextLine();
        System.out.println(VowelCount(str)); 
        
    }
}