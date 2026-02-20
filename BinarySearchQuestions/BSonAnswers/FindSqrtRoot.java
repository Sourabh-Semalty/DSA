package BinarySearchQuestions.BSonAnswers;

public class FindSqrtRoot {
    public static int sqrt(int n) {
        int low = 1;
        int high = n / 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            if ((mid * mid) <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = sqrt(n);
        System.out.println(ans);
    }
}
