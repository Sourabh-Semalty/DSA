public class MajorityElementEasy {

    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                majorityElement = nums[i];
            }
            if (majorityElement == nums[i]) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        MajorityElementEasy solution = new MajorityElementEasy();
        int[] nums = { 2, 2, 1, 1, 3, 2, 2, 3, 3, 3, 3 };
        int result = solution.majorityElement(nums);
        System.out.println("The majority element is " + result);

    }
}