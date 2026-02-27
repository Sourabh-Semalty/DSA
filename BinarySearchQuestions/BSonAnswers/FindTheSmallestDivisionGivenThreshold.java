package BinarySearchQuestions.BSonAnswers;

public class FindTheSmallestDivisionGivenThreshold {
    public boolean isItValid(int[] nums, int threshold, int divisor) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            counter += Math.ceil((double) nums[i] / divisor);
        }

        return counter <= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            right = Math.max(right, nums[i]); // maximum
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isItValid(nums, threshold, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 21212, 10101, 12121 };
        int threshold = 1000000;
        FindTheSmallestDivisionGivenThreshold obj = new FindTheSmallestDivisionGivenThreshold();
        System.out.println(obj.smallestDivisor(arr, threshold));
    }

}
