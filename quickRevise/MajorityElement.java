public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int currentMajority = nums[0];
        int freq = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentMajority) {
                freq += 1;
            } else {
                freq -= 1;
            }

            if (freq == 0)
                currentMajority = nums[i];
        }
        return currentMajority;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        int result = majorityElement(arr);
        System.out.println("Result is " + result);
    }
}
