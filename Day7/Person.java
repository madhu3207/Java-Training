package Day7;

class Person {
    void show() {
        System.out.println("Person");
    }
}

class Student extends Person {//simple student class
    void show() {
        System.out.println("Student");
    }

    public static void main(String[] args) {
        Person p = new Student();
        p.show();
    }
}