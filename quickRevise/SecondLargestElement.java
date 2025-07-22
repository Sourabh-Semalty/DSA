public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = { 50, 60, 75, 100, 95 };

        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (first_max < arr[i]) {
                second_max = first_max;
                first_max = arr[i];
            } else if (second_max < arr[i] && first_max != arr[i]) {
                second_max = arr[i];
            }
        }

        System.out.println("The second largest element in the  array is " + second_max);
    }
}
