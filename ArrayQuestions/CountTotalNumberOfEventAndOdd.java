// Write a C program to count total number of even and odd elements in an array.
// Solution: To find even -> 4 % 2 == 0 it is even else odd.. then count it 
package ArrayQuestions;

public class CountTotalNumberOfEventAndOdd {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int totalOdd = 0;
        int totalEven = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] % 2);
            if (arr[i] % 2 == 0)
                totalEven += 1;
            else
                totalOdd += 1;
        }

        System.out.println("Total even elements:" + totalEven);
        System.out.println("Total odd elements:" + totalOdd);
    }
}


// TimeComplexity => O(n)
// SpaceComplexity => O(1)