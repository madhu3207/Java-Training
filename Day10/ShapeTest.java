package Day10;

abstract class ShapeFigure {
    abstract void area();
}

class CircleShape extends ShapeFigure {
    void area() {
        System.out.println("Circle Area");
    }
}

class RectangleShape extends ShapeFigure {
    void area() {
        System.out.println("Rectangle Area");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        ShapeFigure s;

        s = new CircleShape();
        s.area();

        s = new RectangleShape();
        s.area();
    }
}
