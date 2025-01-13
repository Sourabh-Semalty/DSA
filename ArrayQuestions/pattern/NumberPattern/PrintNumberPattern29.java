public class PrintNumberPattern29 {
    public static void main(String[] args) {
        int limit = 5;
        for(int i = limit;i>=1;i--){
            for(int j = i ; j <=limit;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
