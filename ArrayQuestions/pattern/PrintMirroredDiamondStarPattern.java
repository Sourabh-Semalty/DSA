public class PrintMirroredDiamondStarPattern {
    public static void main(String[] args) {
        int n = 5;
        int k = 5;
        int t= 0;
        for (int i = 0; i < n * 2 - 1; i++) {
            if (i >= n) {
                k++;
                t--;
            } else {
                k--;
                t++;
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("  ");
            }


            for(int p = 0 ; p < t; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
