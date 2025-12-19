public class merge_sorted_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
            int secondPointer = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (secondPointer == n)
                    break;
                if (nums1[i] > nums2[secondPointer]) {
                    nums1[m + secondPointer] = nums1[i];
                    nums1[i] = nums2[secondPointer];
                    secondPointer++;
                } else if (nums1[i] == 0) {
                    nums1[i] = nums2[secondPointer];
                    secondPointer++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 6, 0 };
        int[] arr2 = { 3 };
        merge(arr1, 5, arr2, 1);
    }
}
