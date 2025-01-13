public class PrintNumberPattern31 {
    public static void main(String[] args) {
        int limit = 5;
        int counter = 1;
        for (int i = 1; i <= limit; i++) {
            counter = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            counter--;
            System.err.println();
        }
    }
}