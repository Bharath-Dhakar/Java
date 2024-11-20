public class PrefixSumMaxSubarray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -5, 8};
        int n = arr.length;

        // Step 1: Calculate Prefix Sum
        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Step 2: Find Maximum Subarray Sum
        int maxSum = Integer.MIN_VALUE; // Initialize to minimum value
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Subarray sum using prefix sum
                int currentSum = prefixSum[j] - (i > 0 ? prefixSum[i - 1] : 0);
                // Update maxSum if currentSum is greater
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        // Print the maximum subarray sum
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
