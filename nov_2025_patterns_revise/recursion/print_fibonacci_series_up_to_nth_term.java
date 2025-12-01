package recursion;

public class print_fibonacci_series_up_to_nth_term {

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // recursive function to print series
    public static void printSeries(int n, int i) {
        if (i > n) // base condition
            return;

        System.out.print(fibonacci(i) + " ");
        printSeries(n, i + 1); // recursive call
    }

    public static void main(String[] args) {
        int n = 10; // print up to 10th term
        printSeries(n, 0);
    }
}
