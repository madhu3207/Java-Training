package Day5;

import java.util.Scanner;

public class StoreArray {
    public static void main(String[] args) {//storing array elements
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }
}
