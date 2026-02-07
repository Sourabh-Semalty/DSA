package BinarySearchQuestions;

public class LowerBoundImplement {

    public static int lowerBound(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }
        return -1;
    }

    public static int optimalApporach(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 8, 15, 19 };
        int target = 9;
        int ans = lowerBound(nums, target);
        System.out.println(ans);

        System.out.println("------------Optimal Apporach------------");
        int ans1 = optimalApporach(nums, target);
        System.out.println(ans1);
    }
}
