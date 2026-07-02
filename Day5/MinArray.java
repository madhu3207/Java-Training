package Day5;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < 5; i++) {// finding the minimum element in the array
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum = " + min);

        sc.close();
    }
}
