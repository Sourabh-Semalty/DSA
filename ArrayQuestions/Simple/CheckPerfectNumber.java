import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int total = 0;
        for(int i=1 ; i<= number/ 2; i++) {
            if(number %i == 0) {
                total+= i;
            }
        }

        if(number == total) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not a perfect number");
        }

        sc.close();
    }
}
