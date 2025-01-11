public class PrintNumberPattern28 {
    public static void main(String[] args) {
        int limit = 5;
        for(int i= 1;i<=limit;i++) {
            for(int j =limit;j>=i;j--) {
                System.out.print(j);
            } 
            System.out.println();
        }
    }                                                                                                                                                           
}
