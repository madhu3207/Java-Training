package Day7;

class Laptop {//simple laptop class

    String brand = "Dell";

    Laptop() {
        System.out.println("Object Created");
    }

    void display() {
        System.out.println("Brand: " + brand);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.display();
    }
}
