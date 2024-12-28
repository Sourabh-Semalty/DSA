import java.util.Scanner;

public class PrintAmrstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();


        for(int i = 1 ; i<= limit ; i++) {
            int number = i;
            int total = 0;
            int length = (int) Math.log10(i) +1;
            while (number > 0) {
                int rem = number % 10;
                total += (int) Math.pow(rem, length);
                number /= 10;
            }

            if(total == i) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
