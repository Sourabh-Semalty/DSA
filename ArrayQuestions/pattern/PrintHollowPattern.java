import java.util.Scanner;

public class PrintHollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for(int i = 0 ; i < limit ; i++ ) {
            for(int j = 0; j < limit ; j++) {
                if(i == 0 || j == 0 || i == limit - 1 || j == limit - 1) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}
