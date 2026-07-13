package Day13;

class Student {
    int mark;

    Student(int mark) {
        this.mark = mark;
    }

    void display() {
        System.out.println(mark);
    }

    public static void main(String[] args) {
        Student s = new Student(95);
        s.display();
    }
}
