package basicMaths;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 4554;
        int palindrome = n;
        int reverse = 0;
        while (n != 0) {
            int rem = n % 10;
            reverse = rem + (reverse * 10);
            n /= 10;
        }
        if (palindrome == reverse) {
            System.out.println("It is a palindrom number");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }
}
