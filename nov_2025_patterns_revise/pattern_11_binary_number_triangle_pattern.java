package patterns;

public class pattern_11_binary_number_triangle_pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int parity = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(parity);
                parity = parity == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}
