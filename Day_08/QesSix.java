public class QesSix {
    public static void main(String[] args) {

        int r , c ;
        r = 4  ;
        c = 6 ;

        for(int i = 1 ;  i <= r ;  i++){

            for(int spc  =  1 ;  spc <=  r - i ; spc++ ){
                System.out.print(" ");
            }

            for(int j = 1 ;  j <= c ;  j++){
                if( (i == 1 ) || (i  ==  r) ||(j == 1 ) || (j  ==  r)  ){
                    System.out.print("*");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
    
}
