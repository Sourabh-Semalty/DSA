public class PrintNumberPattern20 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = limit; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}