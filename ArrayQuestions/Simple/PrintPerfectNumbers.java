import java.util.Scanner;

public class PrintPerfectNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for (int i = 5; i <= limit; i++) {
            int total = 0;
            int number = i;
            for (int j = 1; j < i; j++) {
                if (number % j == 0) {
                    total += j;
                }
            }

            if (total == number) {
                System.out.println(i);
            }
        }

        sc.close();
    }

}
