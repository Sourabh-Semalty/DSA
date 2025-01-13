public class PrintNumberPattern32 {
    public static void main(String[] args) {
        int limit = 5;
        int counter;
        for(int i = limit ; i>=1;i--) {
            counter = i;
            for(int j = 1 ; j<=i;j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}
