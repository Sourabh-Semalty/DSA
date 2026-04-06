public class LongestCommonString {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            for (int k = 0; k < strs.length; k++) {
                if (i >= strs[k].length() || strs[k].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        LongestCommonString lcp = new LongestCommonString();
        System.out.println(lcp.longestCommonPrefix(strs));
    }
}
