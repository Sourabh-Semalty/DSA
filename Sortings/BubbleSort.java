// Compare the current element with the next element and swap if the current element is greater than the next element
package Sortings;

public class BubbleSort {
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSwap = true;
                    swap(arr, j, j + 1);
                }
            }

            if (!isSwap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 5, 2, 3 };
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
