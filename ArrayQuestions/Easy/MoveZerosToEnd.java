package ArrayQuestions.Easy;

public class MoveZerosToEnd {

    // Solution 1: space extra approach
    // public static void main(String[] args) {
    //     int[] nums = { 0, 1, 0, 3, 12 };
    //     int[] arr = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         arr[i] = nums[i];
    //     }

    //     int realNum = 0;
    //     int zeroNum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] != 0) {
    //             nums[realNum] = arr[i];
    //             realNum++;
    //         } else {
    //             nums[arr.length - 1 - zeroNum] = 0;
    //             zeroNum++;
    //         }
    //     }
    // }

    // Solution 2: Two - pointer solution extra time complexity
    
    // public static void main(String[] args) {
    //     int[] nums = { 0,0,1};
    //     int size = nums.length;
    //     int j = size - 1;

    //     for (int i = 0; i < size; i++) {
    //         if(nums[i] == 0 ) {
    //             for(int k=i; k < j;k++) {
    //                 nums[k] = nums[k+1];
    //             }
    //             nums[j] = 0;
    //             size = j;
    //             i=-1;
    //             j--;
    //         }
    //     }

    //     for(int i=0;i<nums.length;i++) {
    //         System.out.println(nums[i]);
    //     }
    // }

}

