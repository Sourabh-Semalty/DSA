package recursion;

public class sum_of_first_n_natural_numbers {

    public static int sumOfNatualNumber(int n) {
        if (n == 1)
            return 1;
        return n + sumOfNatualNumber(n - 1);
    }

    public static void main(String[] args) {
        int sum = sumOfNatualNumber(5);
        System.out.println(sum);
    }
}
