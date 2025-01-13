public class PrintNumberPattern39 {
    public static void main(String[] args) {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {  
            int counter = 1;
            for(int j =1; j<=i;j++) {
                System.out.print(counter);
                counter+=2;
            }
            counter-=2;
            for(int j=1;j<i;j++) {
                counter-=2;
                System.out.print(counter);
            }
            System.out.println();
        }
    }
}
