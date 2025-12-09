package Step_3_easy_medium_hard.easy_question;

public class find_the_largest_element_in_an_array {
    public static void main(String[] args) {

        int[] arr = { 2, 5, 1, 3, 0 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        System.out.println(max);
    }
}
