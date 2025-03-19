package Recursion;

public class Factorial {
    static int factorialRec(int n) {
        if (n == 0)
            return 1;
        return n * factorialRec(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int total = factorialRec(n);
        System.out.println("The factorial sum is "+ total);
    }
}
