package patterns;

public class pattern_6_inverted_pyramid_numbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
