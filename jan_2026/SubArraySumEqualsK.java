import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // Map to store frequency of prefix sums
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        // Initialize prefix sum and count of subarrays
        int prefixSum = 0;
        int count = 0;

        // Base case: prefix sum 0 has occurred once
        prefixSumCount.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int remove = prefixSum - k;

            if (prefixSumCount.containsKey(remove)) {
                count += prefixSumCount.get(remove);
            }

            int value = prefixSumCount.getOrDefault(prefixSum, 0);
            prefixSumCount.put(prefixSum, value + 1);

        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        SubArraySumEqualsK obj = new SubArraySumEqualsK();
        System.out.println(obj.subarraySum(nums, k));
    }
}
