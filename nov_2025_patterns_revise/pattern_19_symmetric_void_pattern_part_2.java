public class pattern_19_symmetric_void_pattern_part_2 {
    public static void main(String[] args) {
        int n = 5;

        for (int r = 0; r < 2 * n; r++) {

            int stars, spaces;

            if (r < n) {
                stars = n - r;
                spaces = 2 * r;
            } else {
                stars = r - n + 1;
                spaces = 2 * (2 * n - r - 1);
            }

            // left stars
            for (int i = 0; i < stars; i++)
                System.out.print("*");
            // middle spaces
            for (int i = 0; i < spaces; i++)
                System.out.print(" ");
            // right stars
            for (int i = 0; i < stars; i++)
                System.out.print("*");

            System.out.println();
        }
    }
}
