package BinarySearchQuestions;

public class CountOccurencesInArray {
    public static int firstOccurences(int nums[], int x) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                index = mid;
                high = mid - 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static int lastOccurences(int nums[], int x) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == x) {
                index = mid;
                low = mid + 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 3, 3, 4 };
        int x = 3;

        int count = lastOccurences(arr, x) - firstOccurences(arr, x) + 1;
        System.err.println("Count:" + count);
    }
}
