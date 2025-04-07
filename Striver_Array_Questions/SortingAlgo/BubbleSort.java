package Striver_Array_Questions.SortingAlgo;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 2, 3 };
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            boolean isSwap = false;
            for (int j = 0; j < length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    isSwap = true;
                }
            }

            if(!isSwap) break;
        }

        for(int i=0 ; i< length ;i++) {
            System.out.print(arr[i]);
        }
    }
}
