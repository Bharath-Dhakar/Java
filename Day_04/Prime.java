import java.util.Scanner;

public class Prime {
       
    public static void main(String[] args) {
        
        Scanner sc  = new  Scanner(System.in) ;
            int n = sc.nextInt();
           boolean isPrime = true ;

            if(n > 1){

                for(int i = 2  ;  i <= Math.sqrt(n) ; n++){
                    if(n%i == 0 ){
                        isPrime = false ;
                    }else{
                        isPrime = true ;
                    }

                }
               
            }else{
                isPrime = false ; 
            }

         if(isPrime){
                    System.out.println("haa... haa... ye prime number hai !");
         }else{
            System.out.println("Naa... Naa... :(");
         }
    
    }
}
