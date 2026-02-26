package BinarySearchQuestions.BSonAnswers;

public class MinimumNumberOfBouqet {

    public boolean canMake(int[] bloomDay, int m, int k, int day) {
        int flowers = 0;
        int boquet = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flowers++;
            } else {
                boquet += flowers / k;
                flowers = 0;
            }
        }

        boquet += flowers / k;
        return boquet >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while (low < high) {
            int currentDay = (low + high) / 2;

            if (canMake(bloomDay, m, k, currentDay)) {
                high = currentDay;
            } else {
                low = currentDay + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        MinimumNumberOfBouqet obj = new MinimumNumberOfBouqet();
        int[] bloomDay = { 1, 10, 3, 10, 2 };
        int m = 3;
        int k = 1;
        System.out.println(obj.minDays(bloomDay, m, k));
    }
}
