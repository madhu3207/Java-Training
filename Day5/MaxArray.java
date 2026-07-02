package Day5;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {//finding maximum element in an array
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);

        sc.close();
    }
}
