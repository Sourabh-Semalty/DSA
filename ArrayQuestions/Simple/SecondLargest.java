public class SecondLargest {
    public static void main(String[] args) {
        int array[] = { 41, 2, 3, 8, 1 };
      
        getSecondLargest(array);
    }

    public static void getSecondLargest(int arr[]) {
        int secondLargest = arr[0];
        int largest = arr[1];
        
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
                System.out.println(largest);
                System.out.println(secondLargest);
            }
        }

    }

}