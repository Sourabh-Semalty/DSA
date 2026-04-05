class Solution {
    public String largestOddNumber(String num) {
        int index = -1;

        for (int i = 0; i < num.length(); i++) {
            int current = num.charAt(i) - '0';

            if (current % 2 != 0) {
                index = i; // keep updating
            }
        }

        if (index == -1) {
            return "";
        }

        return num.substring(0, index + 1);
    }
}