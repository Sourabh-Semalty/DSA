public class PrintNumberPattern34 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            int numberLimit = i * 2 - 1;
            for (int j = 1; j <= numberLimit; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
