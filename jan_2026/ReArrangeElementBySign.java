public class ReArrangeElementBySign {
    public int[] rearrangeArray(int[] nums) {
        int halfLength = nums.length;
        int[] positiveIntegers = new int[halfLength];
        int[] negativeIntegers = new int[halfLength];

        int p = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveIntegers[p] = nums[i];
                p++;
            } else {
                negativeIntegers[n] = nums[i];
                n++;
            }
        }

        p = 0;
        n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = positiveIntegers[p++];
            } else {
                nums[i] = negativeIntegers[n++];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        ReArrangeElementBySign solution = new ReArrangeElementBySign();
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] result = solution.rearrangeArray(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
