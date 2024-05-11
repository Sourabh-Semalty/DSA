// Write a C program to count total number of duplicate elements in an array.
package ArrayQuestions;

public class CountDuplicateElement {

    public static void main(String[] args) {
        int arr[] = {1, 10, 20, 1, 25, 1, 10, 10,30, 25, 1};
    
        int duplicateCount = 0;
        for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }
        System.out.println("Total number of duplicate elements : " + duplicateCount);
    }
}

// TimeComplexity = O(n)
// SpaceComlexity = O(1)