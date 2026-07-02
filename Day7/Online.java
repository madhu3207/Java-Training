package Day7;

class Customer {
    String name = "Madhu";
}

class Product {
    String product = "Laptop";
    int price = 50000;
}

class Order {
    public static void main(String[] args) {//simple order class

        Customer c = new Customer();
        Product p = new Product();

        System.out.println("Customer: " + c.name);
        System.out.println("Product: " + p.product);
        System.out.println("Price: " + p.price);
    }
}