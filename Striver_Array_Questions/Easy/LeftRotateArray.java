package Striver_Array_Questions.Easy;

public class LeftRotateArray {
        public static void rotateLeft(int[] nums, int k) {
            int n = nums.length;
            k = k % n; // Handle cases where k > n
    
            // Step 1: Reverse first k elements
            reverse(nums, 0, k - 1);
            
            // Step 2: Reverse the remaining n-k elements
            reverse(nums, k, n - 1);
            
            // Step 3: Reverse the whole array
            reverse(nums, 0, n - 1);
        }
        
        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            int nums[] = {1,2,3,4,5,6,7};
            rotateLeft(nums, 3);
        }
}
