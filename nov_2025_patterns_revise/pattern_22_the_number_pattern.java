public class pattern_22_the_number_pattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                int distance = Math.min(Math.min(top, bottom), Math.min(left, right));
                int value = n - distance;

                System.out.print(value);
            }
            System.out.println();
        }
    }
}
