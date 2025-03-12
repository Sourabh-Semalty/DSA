package FreshUpKnowledge;

public class Pattern10HalfDiamond {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n * 2 - 1; i++) {
            int stars = i;

            if (i > n)
                stars = n * 2 - i;
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
