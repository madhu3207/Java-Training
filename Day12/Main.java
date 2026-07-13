package Day12;

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meows");
    }
}

public class Main {
    public static void main(String[] args) {
        new Dog().sound();
        new Cat().sound();
    }
}
