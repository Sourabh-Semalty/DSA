package jan_2026;

public class LongestSubArray {

    void bruteForceApporach(int k, int nums[]) {
        int max = 0;
        int sum = 0;
        for (int left = 0; left < nums.length; left++) {
            int count = 0;
            for (int right = left; right < nums.length; right++) {
                sum += nums[right];
                count++;
                if (sum == k) {
                    break;
                }
            }
            max = Math.max(max, count);
            sum = 0;
        }

        System.out.println("The longest subarray is " + max);
    }

    void optimalApporach(int k, int nums[]) {
        int max = 0;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println("The longest subarray is " + max);
    }

    public static void main(String[] args) {
        int k = 15;
        int nums[] = { 10, 5, 2, 7, 1, 9 };

        LongestSubArray obj = new LongestSubArray();
        obj.bruteForceApporach(k, nums);
        obj.optimalApporach(k, nums);
    }
}