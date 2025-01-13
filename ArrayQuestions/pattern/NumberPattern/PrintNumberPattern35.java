public class PrintNumberPattern35 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            int counter = i % 2 == 0 ? 2 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter+=2;
            }
            System.out.println();
        }
    }
}
