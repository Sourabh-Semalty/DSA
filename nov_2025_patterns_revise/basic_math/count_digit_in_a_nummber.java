package basic_math;

public class count_digit_in_a_nummber {
    public static void main(String[] args) {
        int n = 12345;
        int p = n;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("The number of " + p + " is " + count);
    }
}
