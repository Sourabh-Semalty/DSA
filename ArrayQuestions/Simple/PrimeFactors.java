import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean isPrime;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = true;
                for (int k = 2; k < i; k++) { // condition can be k <= i/2 reuduce the half of time
                    if (i % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true)
                    System.out.println("Prime factors are:" + i);
            }
        }

        sc.close();
    }
}
