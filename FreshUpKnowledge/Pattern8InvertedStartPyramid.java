package FreshUpKnowledge;

public class Pattern8InvertedStartPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
