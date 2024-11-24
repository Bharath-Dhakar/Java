public class SubArray {

        public static void printSubarrays(int numbers[]) {

            
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i; j < numbers.length; j++) {
                    // Print elements from index i to j
                    System.out.print("[ ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(numbers[k] + " ");
                    }
                    System.out.print("] ");
                    System.out.println();  // new line
                }
                System.out.println();  // extra line between groups
            }
        }


    
        public static void main(String[] args) {

            int numbers[] = {2, 4, 6};
            printSubarrays(numbers);
        }
    
    
}
