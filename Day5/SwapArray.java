package Day5;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {//swapping first and last elements of an array
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        System.out.println("After Swapping:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
