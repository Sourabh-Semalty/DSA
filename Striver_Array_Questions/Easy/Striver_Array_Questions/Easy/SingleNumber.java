package Striver_Array_Questions.Easy.Striver_Array_Questions.Easy;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = { 4, 1, 2, 1, 2 };
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all elements
        }
        System.out.println("The single number is "+ result);
    }
}
