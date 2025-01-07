package ArrayQuestions.pattern;

public class PrintHeartPattern {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i <= n/2; i++) {
            for(int j = i ; j <= n/2;j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= i*2- 1;k++) {
                if(i >= 3) {
                    System.out.print("*");
                }
            }
            for(int k = n-i; k>=i;k--) {
                if(i >= 3) {
                    System.out.print("-");
                }
            }
            for(int k = 1; k<= i*2- 1;k++) {
                if(i >= 3) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n * 2 - i; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
