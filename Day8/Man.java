package Day8;

public class Man {
    String name = "Madhu";
}

class Student extends Person {
    int rollNo = 101;

    void display() {
        System.out.println(rollNo);
    }

    public static void main(String[] args) {//College Management System Using Inheritance
        Student s = new Student();
        s.display();
    }
}
    

