package BinarySearchQuestions;

public class FindHowManyTimesArrayRotated {
    int findMinimumIndex(int arr[], int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        FindHowManyTimesArrayRotated ob = new FindHowManyTimesArrayRotated();
        int index = ob.findMinimumIndex(arr, 0, arr.length - 1);
        System.out.println("Index: " + index);
    }
}
