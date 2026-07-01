package Day4;

public class SearchNumber {
    public static void main(String[] args) {//demonstrating labeled break statement

        int[][] arr = {
            {1, 2, 3},
            {4, 7, 6},
            {8, 9, 10}
        };

        outer:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 7) {
                    System.out.println("Found at " + i + ", " + j);
                    break outer;
                }
            }
        }
    }
}
