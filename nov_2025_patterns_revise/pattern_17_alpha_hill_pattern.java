public class pattern_17_alpha_hill_pattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                char c = (char) ('A' + k);
                System.out.print(c);
            }

            for (int l = i - 2; l >= 0; l--) {
                char c = (char) ('A' + l);
                System.out.print(c);
            }

            System.out.println();
        }
    }
}
