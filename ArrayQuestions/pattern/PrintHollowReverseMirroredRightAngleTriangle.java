public class PrintHollowReverseMirroredRightAngleTriangle {
    public static void main(String[] args) {
        for(int i =0  ;i < 5 ;i ++ ) {
            int j = 0;
            for(j = 0 ; j < i ; j++) {
                System.out.print(" ");
            }
            for(int k= i ; k <= 5; k++) {
                if(i ==0 || k == 5 || k ==i)
                System.out.print("*");
                else System.out.print(" ");
            }
            // System.out.print(j);
            System.out.println();
        }
    }
}
