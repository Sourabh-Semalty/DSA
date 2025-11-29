public class pattern_18_alpha_triangle_pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            char start = (char) ('A' + n - i); // starting character
            for (char c = start; c <= 'E'; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
