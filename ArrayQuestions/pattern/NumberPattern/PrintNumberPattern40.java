public class PrintNumberPattern40 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i * 2; k < limit * 2; k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
