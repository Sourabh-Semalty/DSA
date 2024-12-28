import java.util.Scanner;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= limit; i++) {
            int counter = 0;
            int primeNumber = 0;
            for (int j = 2; j <= i; j++) {
                primeNumber = j;
                if (i % j == 0) {
                    counter += 1;
                }

                if (counter > 1)
                    break;
            }
            if (counter == 1) {
                sum += primeNumber;
            }
        }
        System.out.println("Sum of all prime number is :" + sum);

        sc.close();
    }

}
