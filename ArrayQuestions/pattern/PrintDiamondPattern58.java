public class PrintDiamondPattern58 {
    public static void main(String[] args) {
        int limit = 5;
        int counter = -1;
        for (int i = 1; i < limit * 2; i++) {
            if (i > limit) {
                counter -= 2;
            } else {
                counter += 2;
            }
            int printLimit = 1;
            int printCounter = counter + 1;
            for (int j = 0; j <= printCounter; j++) {
                if (j == 0 || j == printCounter) {
                    System.out.print("*");
                } else {
                    System.out.print(printLimit);
                    int mid = counter / 2;
                    if (j > mid) {
                        printLimit--;
                    } else {
                        printLimit++;
                    }
                }
            }
            System.out.println();
        }
    }
}
