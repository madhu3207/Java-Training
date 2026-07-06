package Day8;

class Demo1 {
    Demo1() {
        this(50);
        System.out.println("Default Constructor");
    }

    Demo1(int x) {
        System.out.println("Value = " + x);
    }

    public static void main(String[] args) {
        new Demo1();
    }
}
