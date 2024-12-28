import java.util.Scanner;

public class CheckAmrstrong {

    static int power(int number, int pow, int total) {
        if (pow == 0) {
            return total;
        }
        total *= number;
        return power(number, pow - 1, total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int amrstrongNumber  = number;

        int length = String.valueOf(number).length();

        int total = 0;
        while (number > 0) {
            int rem = number % 10;
            // total += (int) Math.pow(rem, length);
            total += power(rem, length, 1);
            number /= 10;
        }

        if (amrstrongNumber == total) {
            System.out.println("The number is amrstrong");
        } else {
            System.out.println("The number is not a amstrong number");
        }

        sc.close();
    }
}
