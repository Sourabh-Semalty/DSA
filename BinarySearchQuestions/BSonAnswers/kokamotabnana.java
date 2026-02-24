package BinarySearchQuestions.BSonAnswers;

public class kokamotabnana {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find maximum pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            int hours = 0;
            for (int pile : piles) {
                hours += (int) Math.ceil((double) pile / mid);
            }

            if (hours <= h) {
                right = mid; // try smaller speed
            } else {
                left = mid + 1; // need more speed
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 11 };
        int h = 8;
        kokamotabnana obj = new kokamotabnana();
        System.out.println(obj.minEatingSpeed(arr, h));
    }
}