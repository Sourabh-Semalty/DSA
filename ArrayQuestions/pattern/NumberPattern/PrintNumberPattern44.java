public class PrintNumberPattern44 {
    public static void main(String[] args) {
        int limit = 5;
        int count = 0;
        int value;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                value = count + i;
            } else {
                value = count + 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                if (i % 2 == 0)
                    value--;
                else
                    value++;

                count++;
            }
            System.out.println();
        }
    }
}
