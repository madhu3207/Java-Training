package Day6;

public class MaxElement {//finding maximum element in an array
    public static void main(String[] args) {
        int[] arr = {12, 5, 20, 8, 3};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);
    }
}
