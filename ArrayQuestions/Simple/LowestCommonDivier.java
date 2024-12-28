public class LowestCommonDivier {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 30;

        int lcm = 1;

        int counter = 2;
        while (n1 != 1 || n2 != 1) {
            if (n1 % counter == 0 && n2 % counter == 0) {
                lcm *= counter;
                n1 /= counter;
                n2 /= counter;
            } else if (n1 % counter == 0) {
                lcm *= counter;
                n1 /= counter;
            } else if (n2 % counter == 0) {
                lcm *= counter;
                n2 /= counter;
            } else {
                counter++;
            }
        }

        System.out.println("LCM:" + lcm);

    }
}
