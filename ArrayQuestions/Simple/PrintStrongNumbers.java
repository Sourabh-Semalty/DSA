import java.util.Scanner;

public class PrintStrongNumbers {
    static int factorial(int num) {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for(int i = 1; i<= limit ; i++  ) {
            int number= i;
            int perfectNumber = number;
            int total = 0;
            while (number > 0) {
                int rem = number % 10;
            total += factorial(rem);
            number /= 10;
        }
        if (perfectNumber == total) {
            System.out.println(perfectNumber);
        }
    }
        sc.close();
    }

}
