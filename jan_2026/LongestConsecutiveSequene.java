import java.util.HashSet;

public class LongestConsecutiveSequene {
    public int longestConsecutiveSeq(int[] nums) {
        if (nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestSequence = 1;

        for (int n : set) {
            // start only if this number is the beginning

            if (!set.contains(n - 1)) {
                int current = n;
                int streak = 1;

                while (set.contains(current + 1)) {
                    streak++;
                    current++;
                }
                longestSequence = Math.max(longestSequence, streak);
            }

        }

        return longestSequence;

    }

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        LongestConsecutiveSequene lcs = new LongestConsecutiveSequene();
        System.out.println(lcs.longestConsecutiveSeq(arr));
    }
}