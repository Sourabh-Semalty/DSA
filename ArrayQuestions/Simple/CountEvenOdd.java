public class CountEvenOdd {
    static void countEvenOdd(int arr[]) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) even+=1;
            else odd+=1;
        }
        System.out.println("Total even element "+even );
        System.out.println("Total odd element "+odd );
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        countEvenOdd(arr);
    }
}
