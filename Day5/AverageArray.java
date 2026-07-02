package Day5;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {//demonstrating average of array elements
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / 5;

        System.out.println("Average = " + average);

        sc.close();
    }
}
