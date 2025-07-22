public class LeftRotateByKRevise {

    public static void reverse(int a[], int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 6 % arr.length;

        // Step: 1 Reverse the element from 0 to kth position
        reverse(arr, 0, k - 1);

        // Step: 2 Revers the rest element from kth to n-1 position
        reverse(arr, k, arr.length - 1);

        // Step: 3 Reverse the entire element to make it left rotate
        reverse(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
