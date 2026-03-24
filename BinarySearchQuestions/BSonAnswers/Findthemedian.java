package BinarySearchQuestions.BSonAnswers;

import java.util.Arrays;

public class Findthemedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Step 1: Create new array
        int[] merged = new int[nums1.length + nums2.length];

        // Step 2: Copy elements
        int i = 0;
        for (int num : nums1) {
            merged[i++] = num;
        }
        for (int num : nums2) {
            merged[i++] = num;
        }

        // Step 3: Sort array
        Arrays.sort(merged);

        // Step 4: Find median
        int n = merged.length;

        if (n % 2 == 0) {
            // even case
            return (merged[n / 2] + merged[n / 2 - 1]) / 2.0;
        } else {
            // odd case
            return merged[n / 2];
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3 };
        int nums2[] = { 2 };
        Findthemedian obj = new Findthemedian();
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));
    }
}
