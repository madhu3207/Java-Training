package Day8;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {//simple student class with parameterized constructor
        Student s = new Student(101, "Madhu");
        s.display();
    }
}
