package Striver_Array_Questions.Easy;

public class FindSecondLargestElementInArray {
    public static int[] getSecondOrderElements(int n, int[] a) {
        int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            // Finding first and second largest
            if (a[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = a[i];
            } else if (a[i] > secondLargest && a[i] < firstLargest) {
                secondLargest = a[i];
            }

            // Finding first and second smallest
            if (a[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = a[i];
            } else if (a[i] < secondSmallest && a[i] > firstSmallest) {
                secondSmallest = a[i];
            }
        }
        int output[] = {secondLargest,secondSmallest};
        return output;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int op[] = getSecondOrderElements(arr.length, arr);
        for (int i = 0; i < op.length; i++) {
            System.out.println(op[i]);
        }
    }
}
