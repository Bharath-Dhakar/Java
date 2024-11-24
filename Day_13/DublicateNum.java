public class DublicateNum {

    public static boolean findDuplicate(int numbers[]) {
        int n = numbers.length;

        
        for (int i = 0; i < n; i++) {
           
            for (int j = 0; j < n; j++) {
               
                if (i != j && numbers[i] == numbers[j]) {
                    return true; 
                }
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 5, 6 ,1}; 
        boolean duplicate = findDuplicate(numbers);

        System.out.println(duplicate); 
    }
}
