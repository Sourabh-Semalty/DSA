public class PrintHollowMirroredRightAngleTraingle {
        public static void main(String[] args) {
            for(int i =0 ; i< 5 ;i++) {
                for(int j = i ; j < 5; j++ ){
                    System.out.print(" ");
                }
    
                for(int k = 0; k <= i ; k++) {
                    if(k == 0 || k ==  i || i == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
