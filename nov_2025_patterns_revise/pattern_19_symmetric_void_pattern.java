public class pattern_19_symmetric_void_pattern {

    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= n - i; l++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }

        space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }
}
