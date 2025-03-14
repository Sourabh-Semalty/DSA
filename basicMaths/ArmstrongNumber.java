package basicMaths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int armstrong = n;
        int cubicNumber = 0;

        while (n != 0) {
            int rem = n % 10;
            cubicNumber = (int) (cubicNumber + Math.pow(rem, 3));
            n = n / 10;
        }

        if (armstrong == cubicNumber) {
            System.out.println("It is a armstrong number");
        } else {
            System.out.println("It is not a armstrong number");
        }
    }
}
