package Striver_Array_Questions.SortingAlgo;

public class MergeSort {

    static void merge(int arr[], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                idx1++;
                x++;
            } else {
                merged[x] = arr[idx2];
                idx2++;
                x++;
            }
        }

        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            idx1++;
            x++;
        }

        while (idx2 <= end) {
            merged[x] = arr[idx2];
            idx2++;
            x++;
        }

        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    static void mergeSort(int arr[], int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid); // left side
        mergeSort(arr, mid + 1, end); // right side

        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 5, 2, 3 };

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}