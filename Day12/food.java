package Day12;

class Food {
    void order() {
        System.out.println("Food Ordered");
    }
}

class Pizza extends Food {
    void order() {
        System.out.println("Pizza Delivered");
    }
}

class Customer {
    Food f;

    Customer(Food f) {
        this.f = f;
    }

    void display() {
        f.order();
    }

    public static void main(String[] args) {
        Customer c = new Customer(new Pizza());
        c.display();
    }
}
