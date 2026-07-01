package Day3;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {//performing basic arithmetic operations based on user input

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Answer = " + (a + b));
        } else if (op == '-') {
            System.out.println("Answer = " + (a - b));
        } else if (op == '*') {
            System.out.println("Answer = " + (a * b));
        } else if (op == '/') {
            System.out.println("Answer = " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}

