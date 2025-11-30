package basic_math;

public class check_palindrome_or_not {
    public static void main(String[] args) {
        int n = 12321;
        int reverseNum = 0;
        int p = n;
        while (n != 0) {
            int rem = n % 10;
            reverseNum = rem + reverseNum * 10;
            n /= 10;
        }
        if (p == reverseNum) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}
