package Striver_Array_Questions.SortingAlgo;

public class BubbleSortRev {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 5, 2, 3 };

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j<arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
