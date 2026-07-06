package Day8;

public class Employee3 {
    int id;
    String name;

    Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Employee3 e = new Employee3(101, "Madhu");
        e.display();
    }
}

