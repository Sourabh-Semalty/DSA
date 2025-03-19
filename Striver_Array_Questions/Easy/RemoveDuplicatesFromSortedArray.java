package Striver_Array_Questions.Easy;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int n = nums.length -1;
        for(int i = 0;i<n;i++) {
            int currentElement = nums[i];
            for(int j = i;j<n;j++) {
                if(currentElement == nums[j+1]) nums[j+1] = -1;
            }
            if(nums[i] != -1) count++;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };
        int count = removeDuplicates(arr);
        System.out.println("The count is " + count);
    }
}
