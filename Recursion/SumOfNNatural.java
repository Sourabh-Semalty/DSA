package Recursion;

public class SumOfNNatural {
    static int sumOfNatualNumber(int n) {
        if (n == 1)
            return 1;
        return n + sumOfNatualNumber(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int total = sumOfNatualNumber(n);
        System.out.println("The sum of total is :" + total);
    }
}
