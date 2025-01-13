public class PrintTrainglePattern01 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            for(int j= 1; j<=i; j++) {
                if(j % 2 ==0) System.out.print(0);
                else System.out.print(1);
            }
            System.out.println();
        }
    }
}