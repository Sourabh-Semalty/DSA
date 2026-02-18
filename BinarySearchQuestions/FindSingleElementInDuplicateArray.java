package BinarySearchQuestions;

public class FindSingleElementInDuplicateArray {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] - nums[low + 1] != 0) {
                return nums[low];
            }
            low += 2;
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }
}
