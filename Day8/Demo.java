package Day8;

class Demo {

    Demo() {
        this(100);
        System.out.println("Default Constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {//simple demo class with constructor chaining
        new Demo();
    }
}
