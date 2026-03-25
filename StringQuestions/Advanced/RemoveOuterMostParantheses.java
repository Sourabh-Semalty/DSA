package StringQuestions.Advanced;

public class RemoveOuterMostParantheses {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0)
                    res.append(s.charAt(i));
                count++;
            } else {
                count--;
                if (count > 0)
                    res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        RemoveOuterMostParantheses obj = new RemoveOuterMostParantheses();
        System.out.println(obj.removeOuterParentheses("(()())(())(()(()))"));
    }
}
