package jan_2026;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] optimalApproach(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }

            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public int[] bruteForceApproach(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target)
                    return new int[] { i, j };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] optimalResult = twoSum.optimalApproach(nums, target);
        int[] bruteForceResult = twoSum.bruteForceApproach(nums, target);

        System.out.println("Optimal Approach Result: ");
        for (int i : optimalResult) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Brute Force Approach Result: ");
        for (int i : bruteForceResult) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
