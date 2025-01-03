public class PrintRightArrowStartPattern {
    public static void main(String[] args) {
        int limit = 5;
        int spaces = 1;
        int star = 5;
        for(int i = 1 ; i < limit*2; i++) {
            for(int j = 1 ; j < spaces; j++) {
                System.out.print("  ");
            }

            for(int k = 1; k <= star; k++){
                System.out.print("*");
            }
            if(i < limit) {
                spaces++;
                star--;
            } else {
                star++;
                spaces--;
            }
            System.out.println();
        }
    }
}
