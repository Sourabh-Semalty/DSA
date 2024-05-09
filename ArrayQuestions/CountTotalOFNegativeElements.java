// Write a C program to count total number of negative elements in an array.
// Solution -> If the element is less than 0 then increase the count.
package ArrayQuestions;

public class CountTotalOFNegativeElements {
    public static void main(String[] args) {
        int arr[] = { 10, -2, 5, -20, 1, 50, 60, -50, -12, -9 };

        int negativeCount = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < 0)
        // negativeCount++;
        // }

        int length = arr.length;
        for (int i = 0; i < (length + 1) / 2; i++) {
            if (arr[i] < 0)
                negativeCount++;
            if (arr[length - i - 1] < 0)
                negativeCount++;
        }

        System.out.println("Total number of negative elements: " + negativeCount);
    }
}

// TimeComplexity -> O(n);
// SpaceComplexty -> O(1);
