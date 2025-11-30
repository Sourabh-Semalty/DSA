package basic_math;

public class reverse_digit_of_number {
    public static void main(String[] args) {
        int n = 12345;
        int reverseNum = 0;
        while (n != 0) {
            int rem = n % 10;
            reverseNum = rem + reverseNum * 10;
            n /= 10;
        }
        System.out.println("The reverse Number is " + reverseNum);
    }
}
