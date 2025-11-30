package basic_math;

public class find_gcd_of_numbers {
    public static void main(String[] args) {
        int n = 9;
        int gcd = 1;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                gcd = i;
        }
        System.out.println("GCD is " + gcd);
    }
}
