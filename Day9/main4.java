package Day9;

class Professor {
    String name = "John";
}

class College {
    Professor p;

    College(Professor p) {
        this.p = p;
    }

    void display() {
        System.out.println(p.name);
    }

    public static void main(String[] args) {
        Professor p = new Professor();
        College c = new College(p);
        c.display();
    }
}