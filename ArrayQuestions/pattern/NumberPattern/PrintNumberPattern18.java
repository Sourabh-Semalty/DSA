public class PrintNumberPattern18 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            for (int k = i; k > 1; k--) {
                System.out.print(k);
            }
            for (int j = 1; j <= limit - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
