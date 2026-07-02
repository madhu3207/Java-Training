package Day6;

public class MinElement {//finding minimum element in an array
    public static void main(String[] args) {
        int[] arr = {12, 5, 20, 8, 3};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum Element = " + min);
    }
}
