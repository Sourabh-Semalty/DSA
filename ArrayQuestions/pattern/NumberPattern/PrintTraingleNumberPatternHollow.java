public class PrintTraingleNumberPatternHollow {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == limit || j == i || j == 1) {
                    System.out.print(1);
                } else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
