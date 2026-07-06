package Day8;

class Mobile {
    String brand;
    int price;

    Mobile() {
        brand = "Samsung";
        price = 20000;
    }

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {//Constructor Overloading
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("OnePlus", 35000);

        m1.display();
        m2.display();
    }
}
