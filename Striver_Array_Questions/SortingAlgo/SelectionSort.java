package Striver_Array_Questions.SortingAlgo;

public class SelectionSort {
    public static void main(String[] args) { // n*2
        int[] arr = { 4, 1, 5, 2, 3 };
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int smallestIndex = i; // unsorted part starting
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }M

            // swapping
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
        }
    }
}
