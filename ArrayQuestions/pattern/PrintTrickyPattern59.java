public class PrintTrickyPattern59 {
    public static void main(String[] args) {
        int limit = 5;
        int counter = 1;
        for (int i = 1; i < limit * 2; i++) {
            for (int j = 1; j < limit * 2; j++) {
                if (i == j || j == (limit * 2 - i)) {
                    System.out.print(counter);
                } else {
                    System.out.print(" ");
                }
            }
            if (i >= limit) {
                counter--;
            } else {
                counter++;
            }
            System.out.println();
        }
    }
}
