public class PrintNumberPattern30 {
    public static void main(String[] args) {
        int limit =5;
        for(int i =1 ;i<=limit;i++) {
            for(int j = i;j<=limit;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
