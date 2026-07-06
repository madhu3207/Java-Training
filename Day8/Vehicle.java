package Day8;

class Vehicle {
    void start() {
        System.out.println("Vehicle Starts");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is Riding");
    }

    public static void main(String[] args) {//simple bike class with inheritance
        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
