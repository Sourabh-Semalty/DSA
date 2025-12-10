public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        return currentIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        remove_duplicates_from_sorted_array obj = new remove_duplicates_from_sorted_array();
        System.out.println(obj.removeDuplicates(arr));
    }
}
