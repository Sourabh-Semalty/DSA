import java.util.Scanner;
public class PrintMirroredParrelogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < limit; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
