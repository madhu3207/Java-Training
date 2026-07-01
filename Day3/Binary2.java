package Day3;

import java.util.Scanner;

public class Binary2 {

    public static void main(String[] args) {//checking binary number is valid or not
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        System.out.println("Binary number is: " + binary);

        sc.close();
    }
}

