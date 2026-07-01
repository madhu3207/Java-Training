package Day4;

public class LabelContinue {
    public static void main(String[] args) {//demonstrating labeled continue statement

        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    continue outer;
                }

                System.out.println(i + " " + j);
            }
        }
    }
}
