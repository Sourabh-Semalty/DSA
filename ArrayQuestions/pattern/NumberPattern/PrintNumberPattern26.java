public class PrintNumberPattern26 {
    public static void main(String[] args) {
        int limit = 5;
        for(int i =limit;i>=1;i--) {
            for(int j = i; j >=1 ;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
