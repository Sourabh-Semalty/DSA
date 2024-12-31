public class PrintHollowInvertedTriangle {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 2 * i - 1; k > 0; k--) {
                if(i == 5 || k == 2 * i - 1|| k == 1)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

}
