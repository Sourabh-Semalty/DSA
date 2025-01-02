public class PrintHalfDiamondStartPattern {
    public static void main(String[] args) {
            int n = 5;
            int k = 0;
            for(int i = 0; i<n*2; i++){
                if(i >= n) {
                    k--;
                } else {
                    k++;
                }
                for(int j = 0 ; j < k ; j++) {
                    System.err.print("*");
                }
                System.out.println();
            }
    }
}