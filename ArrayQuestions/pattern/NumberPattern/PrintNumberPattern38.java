public class PrintNumberPattern38 {
    public static void main(String[] args) {
        int limit = 5;
        int counter = 1;
        for (int i = 1; i <= limit; i++) {
            counter = i + 1;
            for (int j = 3; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            for (int j = (i * 2) - 1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
