package FreshUpKnowledge;

public class Pattern20SymmetricButterflyPattern {
    public static void main(String[] args) {
        int n = 3;
        // int totalLength = n * 2;

        // int mid = totalLength / 2;
        // for (int i = 1; i <= mid; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int k = 1; k <= ((mid - i) * 2); k++) {
        // System.out.print(" ");
        // }
        // for (int l = 1; l <= i; l++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 2; i <= mid; i++) {
        // for (int j = mid; j >= i; j--) {
        // System.out.print("*");
        // }
        // for (int k = 1; k < (i * 2 -1); k++) {
        // System.out.print(" ");
        // }
        // for (int l = mid; l >= i; l--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        int spaces = 2 * n - 2;

        // Outer loop for printing row.
        for (int i = 1; i <= 2 * n - 1; i++) {

            // stars for first half
            int stars = i;

            // stars for the second half.
            if (i > n)
                stars = 2 * n - i;

            // for printing the stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // for printing the spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // for printing the stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }
}
