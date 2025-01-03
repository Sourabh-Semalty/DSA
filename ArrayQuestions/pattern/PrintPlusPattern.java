public class PrintPlusPattern {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i < limit * 2; i++) {
            for (int j = 1; j <  limit*2; j++) {
                if(j == 5 || i == 5) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
