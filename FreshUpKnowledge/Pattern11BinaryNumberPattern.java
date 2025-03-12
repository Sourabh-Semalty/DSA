package FreshUpKnowledge;

public class Pattern11BinaryNumberPattern {

    public static void main(String[] args) {
        int n = 5;
        int binaryNumber = 1;
        for(int i = 0; i<n; i++) {
            if(i%2 == 0) binaryNumber = 1;
            for(int j = 0;j<=i;j++) {
                System.out.print(binaryNumber);
                binaryNumber = binaryNumber == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}