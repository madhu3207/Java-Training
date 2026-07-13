package Day18;

public class InsertionSortDescending {

    public static void main(String[] args) {

        int[] arr = {12, 5, 30, 18, 7};

        int n = arr.length;

        // Insertion Sort in Descending Order
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Array in Descending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
