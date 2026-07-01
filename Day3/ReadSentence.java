package Day3;

import java.util.Scanner;

public class ReadSentence {
    public static void main(String[] args) {//reading integer and sentence from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Integer: " + num);
        System.out.println("Sentence: " + sentence);

        sc.close();
    }
}
