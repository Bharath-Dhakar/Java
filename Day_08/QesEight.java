public class QesEight {
    
public static void main(String[] args) {
    int r  =  5  ;
    for(int i =  1  ;  i <= r  ; i ++){

        int count = 1 ; 

        for(int spc =  1  ;  spc <= r-i  ; spc ++){
         System.out.print(" ");
        }

        for(int j =  1  ;  j <= i  ; j ++){
            System.out.print(count+ " ");
            count++ ;
        }
        System.out.println(" ");
    }
}

}
