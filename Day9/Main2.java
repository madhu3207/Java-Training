package Day9;

class Vehicle {
    void start() {
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Starts");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Starts");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Vehicle[] v = {new Car(), new Bike()};

        for (Vehicle x : v)
            x.start();
    }
}
