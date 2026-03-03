package BinarySearchQuestions.BSonAnswers;

public class FindKthPositiveNumbers {
    public int findKthPositive(int[] arr, int k) {
        int count = 1;
        int i = 0;

        while (k > 0) {
            if (i < arr.length && arr[i] == count) {
                i++;
            } else {
                k--;
                if (k == 0)
                    return count;
            }
            count++;
        }

        return count;
    }

    public int optimalApprach(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] - (mid + 1) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        int k = 5;
        FindKthPositiveNumbers obj = new FindKthPositiveNumbers();
        System.out.println(obj.findKthPositive(arr, k));
    }
}
