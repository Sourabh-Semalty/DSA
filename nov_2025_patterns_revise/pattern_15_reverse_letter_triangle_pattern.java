package patterns;

public class pattern_15_reverse_letter_triangle_pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                char c = (char) ('A' + j - 1);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
