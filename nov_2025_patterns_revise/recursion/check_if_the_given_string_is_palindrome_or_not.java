package recursion;

public class check_if_the_given_string_is_palindrome_or_not {
    public static boolean checkPalindrome(int i, String input) {
        if (i >= input.length() / 2)
            return true;

        if (input.charAt(i) != input.charAt(input.length() - i - 1))
            return false;

        return checkPalindrome(i + 1, input);
    }

    public static void main(String[] args) {
        String s = "madam"; // Example string to check

        // Check if the string is a palindrome using the Solution class
        System.out.println(checkPalindrome(0, s)); // Output true if palindrome, false if not
    }
}
