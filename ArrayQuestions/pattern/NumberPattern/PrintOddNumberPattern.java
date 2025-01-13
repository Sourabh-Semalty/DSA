public class PrintOddNumberPattern {
    public static void main(String[] args) {
        int limit = 5;
        int oddCounter = 1;
        int initialCounter = 1;
        for(int i = 1; i<=limit;i++) {
            for(int j= i; j<=limit; j++) {
                System.out.print(oddCounter);
                oddCounter+=2;
            }
            initialCounter+=2;
            oddCounter =  initialCounter;
            System.out.println();
        }
    }
}
