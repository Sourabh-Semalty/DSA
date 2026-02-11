// Select the smallest element and swap it with the first element
package Sortings;

public class SelectionSort {

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void selectionSort(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            swap(arr, smallestIndex, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 5, 2, 3 };
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
