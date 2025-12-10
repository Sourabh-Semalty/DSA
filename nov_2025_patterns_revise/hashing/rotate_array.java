public class rotate_array {
    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length - 1;
        k = k % nums.length;
        // 1. reverse the whole array
        reverse(nums, 0, len);

        // 2. reverse from 0 to k
        reverse(nums, 0, k - 1);

        // 3. reverse after k to len (remaninig)
        reverse(nums, k, len);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate_array obj = new rotate_array();
        obj.rotate(array, k);
    }
}