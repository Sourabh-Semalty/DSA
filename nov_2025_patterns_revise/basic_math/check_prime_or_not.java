package basic_math;

public class check_prime_or_not {
    public static void main(String[] args) {
        int n = 13;
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        boolean isPrime = count == 1;
        System.out.println(isPrime ? "It is prime" : "It is not prime");
    }
}
