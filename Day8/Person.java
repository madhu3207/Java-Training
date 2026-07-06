package Day8;

class Person {
    void show() {
        System.out.println("Person Details");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("Employee Working");
    }

    public static void main(String[] args) {//simple person class with inheritance
        Employee e = new Employee();
        e.show();
        e.work();
    }
}
