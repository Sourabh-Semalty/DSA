import java.util.Scanner;

public class CheckStrongNumber {

    static int  factorial(int num) {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int perfectNumber = number;
        int total = 0;
        while (number > 0) {
            int rem = number % 10;
            total += factorial(rem);
            number/=10;
        }

        if(perfectNumber == total) {
            System.out.println("It is a strong number ");
        } else {
            System.out.println("It is not a strong number");
        }

        sc.close();
    }
}
