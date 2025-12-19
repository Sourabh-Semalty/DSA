public class missing_number {
    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        int total = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            total += nums[i];
        }

        int sum = (length * (length + 1)) / 2;
        System.out.println(sum - total);
    }
}
