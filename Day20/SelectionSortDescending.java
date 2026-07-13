package Day20;


public class SelectionSortDescending {

    public static void main(String[] args) {

        int[] arr = {12, 5, 30, 18, 7};
        int n = arr.length;

        // Selection Sort in Descending Order
        for (int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.println("Array in Descending Order:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}