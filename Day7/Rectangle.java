package Day7;

class Rectangle {//simple rectangle class
    int length = 10;
    int breadth = 5;

    void area() {
        System.out.println("Area = " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.area();
        r.perimeter();
    }
}
