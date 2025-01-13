public class PrintNumberPattern37 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            int counter = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter += 1;
            }
            counter -= 1;
            for (int j = 1; j < i; j++) {
                counter -= 1;
                System.out.print(counter);
            }
            System.out.println();
        }
    }

}
