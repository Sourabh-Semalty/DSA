public class PrintNumberPattern46 {
    public static void main(String[] args) {
        int number = 12345;
        int size = (int) Math.log10(number);
        for (int i = 1; i <= size; i++) {
            System.out.println(number);
            number = number / 10;
        }
    }
}
