package FreshUpKnowledge;

public class Pattern19SymmetricVoidPattern {
    public static void main(String[] args) {
        int n = 3;
        int totalLength = n*2-1;
        for(int i = 1; i<=totalLength;i++) {
            for(int j= totalLength;j>=i;j--) {
                System.out.print("*");
            }
            for(int k = 1; k< (i*2-1);k++) {
                System.out.print(" ");
            }
            for(int l = totalLength;l >=i;l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = totalLength; i>=1;i--) {
            for(int j= totalLength;j>=i;j--) {
                System.out.print("*");
            }
            for(int k = 1; k< (i*2-1);k++) {
                System.out.print(" ");
            }
            for(int l = totalLength;l >=i;l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
