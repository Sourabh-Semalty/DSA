package Sortings;

public class MergeSort {

    static void merge(int arr[], int start, int mid, int end) {
        // Correct the size of temp array
        int temp[] = new int[end - start + 1]; // Size should be end - start + 1
        int i = start;
        int j = mid + 1;
        int k = 0;

        // Merge the two halves into temp[]
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right half, if any
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted temp[] back to the original array arr[]
        for (int l = 0; l < temp.length; l++) {
            arr[start + l] = temp[l]; // Make sure to start from 'start'
        }
    }

    static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid); // Recursively sort the first half
            mergeSort(arr, mid + 1, end); // Recursively sort the second half

            merge(arr, start, mid, end); // Merge the sorted halves
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 5, 2, 3 };
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
