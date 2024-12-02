public class BLQRevision{
    // BLQR =  Beginner Level Question Revision

    public static void LargestSmallest(int arr[]){

     int Largest = arr[0] ;
     int Smallest =  arr[0];

     for(int i = 0 ; i < arr.length ; i++){
        if(arr[i] > Largest){
            Largest = arr[i];
        }
        if(arr[i] < Smallest){
            Smallest = arr[i];
        }
     }
   
     System.out.println(" ");
     System.out.println("Largest : " + Largest + " Smallest : " + Smallest);

    }
    public static void sumAvg(int arr[]){

    int sum  = 0 ; 
    int n  =  arr.length ;

    for(int i  = 0  ;  i < n ; i ++){
        sum +=  arr[i] ;
    }

    double avg = (double) sum / n;

System.out.println("sum is : " + sum  + " & Average : " + avg );

    }
    public static void arrReverse(int arr[]){


            int n = arr.length; 
            for (int i = 0; i < n / 2; i++) { // Iterate only through half of the array
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            
        }
    

    }
    public static void Print(int arr[]) {
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void EvenOdd(int arr[]) {

        int evenCount = 0 ;
        int oddCount = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount ++ ;
            }else{
                oddCount ++ ;
            }
        }
        System.out.println();
        System.out.println("Even count is : " + evenCount + "\nOdd count is : " + oddCount );
    } 
    public static void SearchElem(int arr[], int key) {
        boolean found = false; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true; 
                break; 
            }
        }
        
        if (!found) {
            System.out.println("Element not found in array.");
        }
    }
    
    public static void main(String[] args) {

        int[] arr =  {3, 5, 1, 8, 2} ;
      
        Print(arr);
        LargestSmallest(arr);
        sumAvg(arr);
        arrReverse(arr);
        Print(arr);
        EvenOdd(arr);
        SearchElem(arr, 8);


    }
}

