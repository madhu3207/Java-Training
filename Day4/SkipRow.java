package Day4;

public class SkipRow {
    public static void main(String[] args) {//demonstrating labeled continue statement to skip a row

        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2) {
                    continue outer;
                }
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }
}