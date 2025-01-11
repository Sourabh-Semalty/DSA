public class PrintPatternNumber17 {
    public static void main(String[] args) {
        int limit = 5 * 2;
        int counter = 5;
        int p = 1;
        for (int i = 1; i < limit; i++) {
            if (i <= 5) {
                int kCoutner = 5;
                int middleCounter = kCoutner * 2 - i;
                for (int k = 1; k < i; k++) {
                    System.out.print(kCoutner);
                    kCoutner--;
                }
                for (int j = 1; j <= middleCounter - i + 1; j++) {
                    System.err.print(counter - i + 1);
                }
                for (int k = kCoutner + 1; k <= 5; k++) {
                    System.out.print(k);
                }
            } else {
                int kCoutner = 5;
                for (int k = 1; k < counter - p; k++) {
                    System.out.print(kCoutner);
                    kCoutner--;
                }
                for (int j = 1; j < kCoutner * 2 - 1; j++) {
                    System.out.print(kCoutner);
                }
                for (int k = kCoutner; k <= counter; k++) {
                    System.out.print(k);
                }
                p++;
            }
            System.err.println();
        }
    }
}
