public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -5, 8};

        // Step 1: Initialize variables
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;             

        // Step 2: Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]); 
            maxSum = Math.max(maxSum, currentSum);             
        }

        // Step 3: Print the result
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
