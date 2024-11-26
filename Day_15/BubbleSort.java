public class BubbleSort{

public static void sort(int numbers[]) {
    

    for(int turn = 0  ;  turn  < numbers.length-1 ; turn++){
        for(int j = 0  ;  j  < numbers.length-1-turn ; j++){
        
            if(numbers[j] > numbers[j+1]){
                int temp =  numbers[j] ;
                numbers[j] = numbers[j+1] ;
                numbers[j+1] =  temp ;
            
            }
        }
    }
}

    public static void main(String[] args) {

        int arr[] = {2 ,3,5,4,3,2,677,8 } ;
        sort(arr);

        for(int i  = 0  ;  i<arr.length ; i ++ ){
            System.out.println(arr[i] + " ");
        }
     
    }
}


