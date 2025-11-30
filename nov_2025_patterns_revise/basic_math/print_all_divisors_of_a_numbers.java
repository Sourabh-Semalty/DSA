package basic_math;

public class print_all_divisors_of_a_numbers {
    public static void main(String[] args) {
        int n = 36;
        StringBuilder divisors = new StringBuilder();
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0)
                divisors.append(i).append(" ");

        }
        divisors.append(n);
        System.out.println(divisors);
    }
}
