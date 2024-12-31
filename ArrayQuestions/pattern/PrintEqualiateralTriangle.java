public class PrintEqualiateralTriangle {

    public static void main(String[] args) {
        int t = 1;
        for(int i = 1; i<= 5; i++) {
            for(int j = 1 ; j <= 5- i; j++) {
                System.out.print(" ");
            }           

            for(int k = 1 ; k <= t ; k++) {
                System.out.print("*");
            }
            t+=2;
            System.out.println();
        }
    }
}