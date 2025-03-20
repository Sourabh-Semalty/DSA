package Striver_Array_Questions.Easy;

public class RightRotateArray {
        public  static void  reverse(int arr[], int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    
        public static  void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n; // Handle cases where k > n
    
            // Step 1: Reverse the whole array
            reverse(nums, 0, n - 1);
            
            // Step 2: Reverse first k elements
            reverse(nums, 0, k - 1);
            
            // Step 3: Reverse remaining n-k elements
            reverse(nums, k, n - 1);
        }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,3);
    }
}
