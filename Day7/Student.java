package Day7;

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

        Student s1 = new Student(1,"Madhu");
        Student s2 = new Student(2,"Kavi");
        Student s3 = new Student(3,"Hari");

        s1.display();
        s2.display();
        s3.display();
    }
}
