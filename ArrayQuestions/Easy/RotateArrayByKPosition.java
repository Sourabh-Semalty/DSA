package ArrayQuestions.Easy;

public class RotateArrayByKPosition {
        // This solution is O(n*k) as last test case time exceded
    // public static void rotateRightToLeft(int[] nums, int size) {
    // int last = nums[size - 1];
    // for (int i = size - 1; i > 0; i--) {
    // nums[i] = nums[i - 1];
    // }
    // nums[0] = last;
    // }

    public static void reverse(int nums[], int l, int r) {
        while (l <= r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        // 1. Revese the whole array
        reverse(nums, 0, nums.length - 1);
        // 2. Reverse the array till the kth location
        reverse(nums, 0, k - 1);
        // 3. Reverse the right part of array to make it original order as that part is
        // not rotated
        reverse(nums, k, nums.length - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);

        for(int i=0;i< arr.length;i++) {
            System.out.println("Element are :" + arr[i]);
        }
    }
}


// Time  Complexity => O(n)
// Space Complexity => O(1);