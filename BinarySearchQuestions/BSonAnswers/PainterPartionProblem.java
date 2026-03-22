package BinarySearchQuestions.BSonAnswers;

public class PainterPartionProblem {

    public int countPainter(int[] arr, int mid, int neededPainter) {
        int sum = 0;
        int painter = 1;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > mid) {
                painter++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return painter;
    }

    public int paint(int[] arr, int k) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int painters = countPainter(arr, mid, k);
            if (painters > k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int m = 2;
        PainterPartionProblem obj = new PainterPartionProblem();
        System.out.println(obj.paint(arr, m));
    }
}
