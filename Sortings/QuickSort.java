package Sortings;

public class QuickSort {
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int pivotIndex = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                pivotIndex++;
                swap(arr, pivotIndex, j);
            }
        }

        pivotIndex++;
        arr[end] = arr[pivotIndex];
        return pivotIndex;
    }

    void quickSort(int arr[], int start, int end) {
        if (start < end) {

            int pivotIndex = partition(arr, start, end);

            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 5, 2, 3 };
        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
