package BinarySearchQuestions;

public class FinMinInRotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {

        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        FinMinInRotatedArray ob = new FinMinInRotatedArray();
        System.out.println(ob.findMin(arr));
    }
}
