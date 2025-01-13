public class PrintTrainglePattern010 {

    public static void main(String[] args) {
        int limit =5;
        int printVar = 1;
        for(int i =1 ; i<=limit;i++) {
            for(int j= 1; j<=i;j++) {
                System.out.print(printVar);
                printVar = printVar == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }
}