// Write a C program to find second largest element in an array.
// Solution -> Take max1 and max2 two value 
// Solution -> Either sort it and take then second index.
package ArrayQuestions;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = { -7, 2, 3, 8, 6, 6, 75, 38, 3, 2 };

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Explanation => if current index element is greater than the max1 then it
            // means that is the largest number
            // so, assigning max1 value to max2 and current element to max1
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            // Explanation => if current element is less than max1 there is a chance that it
            // might be greater than max2
            // so, in that case we got our second largest
            else if (arr[i] < max1 && arr[i] > max2) {
                max2 = arr[i];
            }
        }

        System.out.println("Second largest Elements is " + max2);
    }
}

// Time Complexity -> O(n)
// Space Complexity -> O(1);