package BinarySearchQuestions.BSonAnswers;

public class CapacityToShipCargoInMinDays {
    public boolean canShip(int[] weights, int days, int capacity) {
        int day = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                day++;
                currentLoad = 0;
            }

            currentLoad += weight;
        }

        return day <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int weights[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        CapacityToShipCargoInMinDays obj = new CapacityToShipCargoInMinDays();
        System.out.println(obj.shipWithinDays(weights, days));
    }
}
