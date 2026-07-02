package Day5;

import java.util.Scanner;

public class CuboidVolume {//calculating volume of cuboid
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = length * breadth * height;

        System.out.println("Volume of Cuboid = " + volume);
    }
}

