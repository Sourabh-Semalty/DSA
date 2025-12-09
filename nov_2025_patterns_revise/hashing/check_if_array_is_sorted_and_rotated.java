package hashing;

public class check_if_array_is_sorted_and_rotated {
    public static boolean isSortedArray(int nums[]) {
        int n = nums.length;
        boolean flag = false;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                if (flag)
                    return false;
                flag = true;
            }
        }
        return nums[n - 1] >= nums[0];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4 };
        System.out.println(isSortedArray(arr));
    }
}
