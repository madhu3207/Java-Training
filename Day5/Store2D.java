package Day5;

import java.util.Scanner;

public class Store2D {
    public static void main(String[] args) {//storing 2D array elements

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];

        System.out.println("Enter 6 elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }
}
