package Striver_Array_Questions.Easy;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2};  
        int n = missingNumber(arr);
        System.out.println(n);

    }
}
