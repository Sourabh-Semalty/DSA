package jan_2026;

public class longest_subarray_with_sum_k_postives_and_negatives {
    public static void main(String[] args) {
        int arr[] = { 1, -1, 1 };
        int k = 3;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            while (sum < k) {
                count++;
                sum += arr[i];
                if (sum == k) {
                    max = Math.max(max, count);
                    break;
                }
            }
        }

        System.out.println("The longest subarray is " + max);
    }
}