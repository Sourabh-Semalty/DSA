import java.util.Scanner;

public class PrintRightAnglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for(int i = 0 ;i < limit ; i++) {
            for(int j = 0; j <= i ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
