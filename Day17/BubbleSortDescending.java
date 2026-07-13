package Day17;

public class BubbleSortDescending {

    public static void main(String[] args) {

        int[] arr = {12, 5, 30, 18, 7};
        int n = arr.length;

        // Bubble Sort in Descending Order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array in Descending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}