package Striver_Array_Questions.Easy;

import java.util.ArrayList;

public class MoveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        int start = 0;
        for (int next = 0; next < nums.length; next++) {
            if (nums[start] == 0) {
                if (nums[next] != 0) {
                    int temp = nums[start];
                    nums[start] = nums[next];
                    nums[next] = temp;
                    start++;
                }
            } else {
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1 };
        moveZeroes(arr);
    }
}