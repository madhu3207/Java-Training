package Day8;
class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(title + " - Rs." + price);
    }

    public static void main(String[] args) {//simple book class with parameterized constructor
        Book b = new Book("Java", 450);
        b.display();
    }
}
