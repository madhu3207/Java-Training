package Day12;

class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Animal[] a = {new Dog(), new Cat()};

        for (Animal x : a)
            x.sound();
    }
}
