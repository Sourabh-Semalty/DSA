package ArrayQuestions.Easy;

public class checkIfArraySortedOrNotGFG {
    public static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        boolean isSorted = isSorted(arr, arr.length);
        System.out.println("The array is sorted : "+ isSorted);
    }

}
