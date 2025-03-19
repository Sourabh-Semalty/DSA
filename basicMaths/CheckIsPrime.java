package basicMaths;

public class CheckIsPrime {

    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                count++;
        }

        if(count == 1) System.out.println("It is prime");
        else System.out.println("It is not a prime number");
    }
}