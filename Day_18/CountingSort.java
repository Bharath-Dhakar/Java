public class CountingSort {

    public static void countSort(int[] arr) {
        // Find the largest element in the array
        int largest = arr[0];
        for (int num : arr) {
            largest = Math.max(largest, num);
        }
        
        // Create count array
        int[] count = new int[largest + 1];
        
        // Count occurrences of each element
        for (int num : arr) {
            count[num]++;
        }
        
        // Modify the original array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 5, 4, 4, 7, 6, 5, 4, 3, 33, 6, 88};
        countSort(arr);
        printArray(arr);
    }
}