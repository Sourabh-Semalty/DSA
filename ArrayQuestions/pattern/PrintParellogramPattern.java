import java.util.Scanner;

public class PrintParellogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for(int i = 0 ; i < limit ; i++ ) {
            for(int j = i; j < limit; j ++ ) {
                System.out.print(" ");
            }
            for(int k = 0; k < limit; k ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
