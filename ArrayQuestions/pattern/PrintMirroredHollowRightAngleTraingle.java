public class PrintMirroredHollowRightAngleTraingle {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 0; i < limit; i++) {
            for (int j = limit; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                if(k == i || k == 0 || i == limit - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}