package Striver_Array_Questions.Easy;

public class LongestSubArray {
    public static int longestSubarray(int[] arr, int k) {
        int maxLength = 0;
        for(int i = 0; i< arr.length; i++) {
            int sum = arr[i];
            int count = 1;
            for(int j = 0;j<arr.length;j++) {
                if(i == j) continue;
                count++;
                sum+= arr[j];
                if(sum == k) break;
            }
            if(sum == k && maxLength < count) {
                maxLength = count;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {-5, 8, -14, 2 ,4, 12};
        int length =  longestSubarray(arr, -5);
        System.out.println(length);
    }
}