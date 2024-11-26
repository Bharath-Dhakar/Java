 public class RotatedArraySearch {
        public static int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2; 
    
                
                if (nums[mid] == target) {
                    return mid;
                }
    
                // Determine which side is sorted

                if (nums[left] <= nums[mid]) {
                    // Left side is sorted
                    
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1; // Target is in the left sorted portion
                    } else {
                        left = mid + 1;  // Target is in the unsorted portion
                    }


                } else {
                    // Right side is sorted
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1; // Target is in the right sorted portion
                    } else {
                        right = mid - 1; // Target is in the unsorted portion
                    }
                }
            }
    
            return -1; // Target not found
        }
    
        public static void main(String[] args) {
            int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
            int target1 = 0;
            System.out.println(search(nums1, target1)); // Output: 4
    
            int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
            int target2 = 3;
            System.out.println(search(nums2, target2)); // Output: -1
    
            int[] nums3 = {1};
            int target3 = 0;
            System.out.println(search(nums3, target3)); // Output: -1
        }
    }
    

