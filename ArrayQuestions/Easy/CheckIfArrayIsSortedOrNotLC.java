package ArrayQuestions.Easy;

public class CheckIfArrayIsSortedOrNotLC {
    public static boolean isSorted(int[] nums, int count, int size) {
        if (nums[0] < nums[size - 1])
            count++;

        for (int i = 1; i < size; i++) {
            if (nums[i - 1] > nums[i])
                count++;
            if (count > 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 3, 4 };
        int count = 0;
        int size = nums.length;

        boolean isSorted = isSorted(nums, count, size);
        System.out.println("The array is sorted :"+ isSorted);
    }
}
