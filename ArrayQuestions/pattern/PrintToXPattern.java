public class PrintToXPattern {
    public static void main(String[] args) {
        int cout = 5 * 2;
        for (int i = 1; i < cout; i++) {
            for (int j = 1; j < cout; j++) {
                if (i == j || j== cout - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}