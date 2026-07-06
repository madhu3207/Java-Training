package Day8;

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    void display() {
        System.out.println("ID = " + this.id);
    }

    public static void main(String[] args) {//simple employee class with parameterized constructor
        Employee e = new Employee(101);
        e.display();
    }
}
