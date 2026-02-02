public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1 : Find the first smallest pivot and value;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: if i >= 0 that means a permutation is possible
        // if not that means the array is in descreasing order (just reverse it)

        if (i >= 0) {
            // Now the find the value from right from which we can swap
            int j = nums.length - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }

            swap(nums, i, j);
        }

        // Reverse the remaning to get the next permutations
        reverse(nums, i + 1, nums.length - 1);

    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        NextPermutation solution = new NextPermutation();
        int[] nums = { 1, 2, 3 };
        solution.nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
