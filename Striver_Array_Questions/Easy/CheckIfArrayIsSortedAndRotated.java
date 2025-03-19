package Striver_Array_Questions.Easy;

public class CheckIfArrayIsSortedAndRotated {

    public static boolean  check(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length;i++) {
            if(nums[i] > nums[(i+1) % nums.length]) {
                count++;
            }
            if(count > 1) return false;
        }
        return true;
    }

        public static void main(String[] args) {
            int arr[] = {3,4,5,1,2};
            boolean isSorted = check(arr);
            if(isSorted) System.out.println("It is sorted");
            else System.out.println("it is not sorted");
        }
}