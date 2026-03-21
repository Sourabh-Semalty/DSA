package BinarySearchQuestions.BSonAnswers;

public class AllocateMinimumNumberOfPages {

    public static int countStudents(int arr[], int maxPages) {
        int student = 1;
        int totalPages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (totalPages + arr[i] > maxPages) {
                student++;
                totalPages = arr[i];
            } else {
                totalPages += arr[i];
            }
        }
        return student;
    }

    public static int optimizeApproach(int arr[], int m, int n) {
        if (m > n)
            return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;

        // Find max element and sum
        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int students = countStudents(arr, mid);

            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 25, 46, 28, 49, 24 };
        int m = 4;
        int n = 5;

        AllocateMinimumNumberOfPages al = new AllocateMinimumNumberOfPages();
        System.out.println(AllocateMinimumNumberOfPages.optimizeApproach(arr, m, n));
    }
}
