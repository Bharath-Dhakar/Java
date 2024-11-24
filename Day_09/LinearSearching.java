public class LinearSearching{

    public static int linear(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) { 
            if (numbers[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};

        int index = linear(numbers, 8); // Search for key 8

        System.out.println("-->> " + index); // Output the result
    }
}

