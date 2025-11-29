package patterns;

public class pattern_10_half_star_pattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars;

            if (i <= n) {
                stars = i;
            } else {
                stars = 2 * n - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
