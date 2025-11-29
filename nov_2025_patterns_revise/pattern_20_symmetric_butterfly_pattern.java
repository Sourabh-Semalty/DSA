public class pattern_20_symmetric_butterfly_pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 0; r < n * 2; r++) {
            int stars, spaces;

            if (r < n) {
                // top half
                stars = r + 1;
                spaces = 2 * (n - r - 1);
            } else {
                // bottom half
                stars = 2 * n - r;
                spaces = 2 * (r - n);
            }

            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
