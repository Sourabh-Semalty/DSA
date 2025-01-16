public class PrintNumberPattern47 {
    public static void main(String[] args) {
        int number = 12345;
        while (number != 0) {
            System.out.println(number);

            int digits = (int) Math.log10(number);
            int placeValue = (int) Math.ceil(Math.pow(10, digits));
            int firstDigit = (int) (number / placeValue);

            number = number - (placeValue * firstDigit);
        }
    }
}
