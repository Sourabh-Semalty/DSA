package hashing;

public class subarray_equals_to_k {

    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int innerSum = 0;
            for (int j = i; j < nums.length; j++) {
                innerSum += nums[j];
                if (k == innerSum) {
                    sum += 1;
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1 };
        int k = 2;
        subarray_equals_to_k obj = new subarray_equals_to_k();
        System.out.println(obj.subarraySum(arr, k));
    }
}