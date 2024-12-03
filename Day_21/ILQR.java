
import java.util.*;
public class ILQR {
    //ILQR  : Intermediate Level Question Revision

    public static int SecondLargest(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  
                largest = num;          
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;    
            }
        }

        return secondLargest ;

    }

    public static boolean Palindrome(int arr[]){
        for(int i =  0 ;  i <  arr.length ; i++){
            
           if(arr[i] != arr[arr.length-1-i]){
            return false ;
           }

        }

        return true ;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
       System.out.println(SecondLargest(arr));
       System.out.println(Palindrome(arr));

    }
}

    


