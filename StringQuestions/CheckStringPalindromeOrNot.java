package StringQuestions;

public class CheckStringPalindromeOrNot {
    public static void main(String[] args) {
        String str = "madam";

        boolean isPalindrom = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }
}
