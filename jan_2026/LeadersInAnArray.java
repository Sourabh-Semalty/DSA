import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersInAnArray {
    public int[] bruteForceApporach(int[] nums) {
        int[] leaders = new int[nums.length];
        int leaderIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                leaders[leaderIndex++] = nums[i];
            }
        }

        return Arrays.copyOf(leaders, leaderIndex);
    }

    public ArrayList<Integer> optimizedApporach(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (nums.length == 0) {
            return ans;
        }

        int max = nums[nums.length - 1];
        ans.add(max);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        LeadersInAnArray solution = new LeadersInAnArray();
        int[] nums = { 16, 17, 4, 3, 5, 2 };
        int[] result = solution.bruteForceApporach(nums);

        System.out.println("-------------Brute Force Apporach-----------");
        for (int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------Optimal Apporach-----------");

        ArrayList<Integer> result2 = solution.optimizedApporach(nums);
        for (int i : result2) {
            System.out.print(i + " ");
        }
    }
}
