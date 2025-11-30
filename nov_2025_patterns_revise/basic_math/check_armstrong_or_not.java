package basic_math;

public class check_armstrong_or_not {
    public static void main(String[] args) {
        int n = 153;
        int arm = 153;
        int result = 0;

        while (n != 0) {
            int rem = n % 10;
            result += Math.pow(rem, 3);
            n = n / 10;
        }

        if (arm == result) {
            System.out.println("This is armstrong");
        } else {
            System.out.println("This is not a amrstrong");
        }
    }
}
