public class PrintNumberPattern43 {
    public static void main(String[] args) {
        int limit = 5;
        int counter = 0;
        int value = 1;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                value += counter;
                System.out.print(value + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
