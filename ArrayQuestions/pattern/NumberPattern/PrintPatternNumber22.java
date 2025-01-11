public class PrintPatternNumber22 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = limit; i >= 1; i--) {
            for(int j =  limit; j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
