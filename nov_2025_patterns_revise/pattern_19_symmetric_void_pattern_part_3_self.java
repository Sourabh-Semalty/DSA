public class pattern_19_symmetric_void_pattern_part_3_self {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 0; r < n * 2; r++) {

            int stars, spaces;

            if (r < n) {
                stars = n - r;
                spaces = 2 * r;
            } else {
                stars = r - n + 1;
                spaces = 2 * (2 * n - r - 1);
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
