package BinarySearchQuestions.BSonAnswers;

public class AggressiveCows {

    public boolean isPossible(int arr[], int N, int k, int mid) {
        int cowCount = 1;
        int lastPos = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i] - lastPos >= mid) {
                cowCount++;
                if (cowCount == k) {
                    return true;
                }
                lastPos = arr[i];
            }
        }
        return false;
    }

    public int solve(int N, int k, int[] arr) {
        int low = 1;
        int high = arr[N - 1] - arr[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(arr, N, k, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int N = 6, k = 4, arr[] = { 0, 3, 4, 7, 10, 9 };
        AggressiveCows obj = new AggressiveCows();
        System.out.println(obj.solve(N, k, arr));
    }
}
