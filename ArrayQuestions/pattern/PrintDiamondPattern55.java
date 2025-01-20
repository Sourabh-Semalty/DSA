public class PrintDiamondPattern55 {
    public static void main(String[] args) {
        int limit = 5;
        int counter = 0;
        for (int i = 1; i <= limit * 2 - 1; i++) {
            if (i > limit) {
                counter--;
            } else {
                counter++;
            }
            for (int j = 1; j <= counter; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
