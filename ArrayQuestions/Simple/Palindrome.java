import java.util.Scanner;

public class Palindrome {

    static void checkPalindrome(int number) {
        int rev = 0;
        int realNumber = number;
        while (number > 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }

        if (realNumber == rev)
            System.out.println("It is an palindrom");
        else
            System.out.println("It is not a palindrom");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter input:");
        int number = sc.nextInt();

        checkPalindrome(number);
        sc.close();
    }
}
