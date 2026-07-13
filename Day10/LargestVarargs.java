package Day10;

public class LargestVarargs {

    static void largest(int... num) {
        int max = num[0];

        for (int i : num) {
            if (i > max)
                max = i;
        }

        System.out.println("Largest = " + max);
    }

    public static void main(String[] args) {
        largest(10, 40, 25, 80, 50);
    }
}