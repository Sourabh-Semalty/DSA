public class PrintHollowDiamondPattern {
    public static void main(String[] args) {
        int limit = 5;
        int leftSpace = limit;
        int rightSpace = 5;
        int star = 1;
        for (int i = 1; i < limit * 2; i++) {
            for (int j = 1; j <= leftSpace; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < star * 2 - 1; k++) {
                System.out.print(" ");
            }

            for(int l = 1; l <= rightSpace; l++ ) {
                System.out.print("*");
            }

            if (i < limit) {
                leftSpace--;
                rightSpace--;
                star++;
            } else {
                star--;
                leftSpace++;
                rightSpace++;
            }
            System.out.println();
        }
    }

}
