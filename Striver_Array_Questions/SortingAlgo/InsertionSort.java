package Striver_Array_Questions.SortingAlgo;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 2, 3 };
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int current = arr[i];
            int prevIndex = i-1;

            while (prevIndex >= 0 && arr[prevIndex] > current)  {
                    arr[prevIndex + 1] = arr[prevIndex];
                    prevIndex--;
            }

            arr[prevIndex + 1] = current;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
        }
    }
}
