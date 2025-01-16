public class PrintNumberPattern42 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            int gap = 4;
            int counter = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter += gap;
                gap--;
            }
            System.out.println();
        }
    }
}
