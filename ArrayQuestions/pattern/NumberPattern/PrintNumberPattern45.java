public class PrintNumberPattern45 {
    public static void main(String[] args) {
        int limit = 5;
        int counter = 1;
        int mid = limit / 2;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
            }
            if (i > mid) {
                counter--;
            } else {
                counter++;
            }
            System.out.println();
        }
    }
}
