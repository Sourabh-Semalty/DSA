public class PrintDiamondPattern {
    public static void main(String[] args) {
        int limit = 5;
        int spaces = limit;
        int star = 1;
        for(int i = 1 ; i < limit*2; i++) {
            for(int j = 1 ; j <= spaces; j++) {
                System.out.print(" ");
            }

            for(int k = 0 ; k < star * 2 - 1; k++ ) {
                System.out.print("*");
            }

            if(i < limit) {
                spaces--;
                star++;
            } else {
                star--;
                spaces++;
            }
            System.out.println();
        }
    }
}
