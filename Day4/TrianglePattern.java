package Day4;

public class TrianglePattern {
    public static void main(String[] args) {//printing triangle pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
