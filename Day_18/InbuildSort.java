import java.util.Arrays;
import java.util.Collections;

public class InbuildSort{


public static void printArray(Integer arr[]){

    for(int i  = 0  ; i < arr.length ; i++ ){
        System.out.print(arr[i] + " ");
    }

}

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        Integer[] arr2 = {7 , 9, 5, 4,3,6};

        Arrays.sort(arr , 0, 2) ;
        Arrays.sort(arr2 ,Collections.reverseOrder());

        printArray(arr2);
    
        
    
    }
}