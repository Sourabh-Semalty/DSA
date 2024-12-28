public class PrintFibonacci {
    public static void main(String[] args) {
        int limit = 10;

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for(int i = 1 ;i <= limit; i++ ) {
            System.out.print(n3 + ",");
            n1 = n2;
            n2 = n3;
            n3 = n1  + n2;
        }
    }
}
