package Sortings;

public class InsertionSort {

    void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prevIndex = i - 1;
            while (prevIndex >= 0 && arr[prevIndex] > current) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex + 1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 5, 2, 3 };
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
