package patterns;

public class pattern_12_number_crown_pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = n * 2 - i; k >= i; k--) {
                System.out.print("*");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
