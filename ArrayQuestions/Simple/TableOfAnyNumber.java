public class TableOfAnyNumber {

    static void table(int n) {
        for(int i =0 ; i<= 10; i++) {
            System.out.println(n + "X" + i + "=" + n * i);
        }
    }

    static void tableUsingRecursion(int n, int i) {
        if(i == 11) {
            return;
        }

        System.out.println(n + "X" + i + "=" + n * i);
        tableUsingRecursion(n, i +1);
    }
    
    public static void main(String[] args) {
        table(2);

        tableUsingRecursion(4,0);
    }
}
