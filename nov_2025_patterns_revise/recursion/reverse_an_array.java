package recursion;

public class reverse_an_array {

    public static int[] reverse(int arr[], int start, int end) {
        if (start > end)
            return arr;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        return reverse(arr, start, end);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        arr = reverse(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
